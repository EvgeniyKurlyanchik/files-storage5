package org.example.serverside;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.example.serverside.authentication.DbHadler;
import org.example.serverside.authentication.DbProvider;

@Slf4j
public class Server {
    private final int MAX_MESSAGE_SIZE = 1024 * 1024 * 1024;
    @SneakyThrows
    public Server() {
        EventLoopGroup auth = new NioEventLoopGroup(1);
        EventLoopGroup worker = new NioEventLoopGroup();
        DbProvider dbProvider = new DbHadler();
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.channel(NioServerSocketChannel.class)
                    .group(auth, worker)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel channel) {
                            channel.pipeline().addLast(
                                    new ObjectDecoder(MAX_MESSAGE_SIZE, ClassResolvers.cacheDisabled(null)),
                                    new ObjectEncoder(),
                                    new ServerHandler(dbProvider)
                            );
                        }
                    });
            ChannelFuture future = bootstrap.bind(8189).sync();
            log.debug("Server started...");
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            log.error("e", e);
        } finally {
            auth.shutdownGracefully();
            worker.shutdownGracefully();
            log.debug("Server stopped");
        }
    }

}