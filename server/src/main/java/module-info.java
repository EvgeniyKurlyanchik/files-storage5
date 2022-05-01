module ru.gb.server {
    requires io.netty.transport;
    requires io.netty.codec;
    requires java.sql;
    requires lombok;
    requires jbcrypt;
    requires ru.gb;
    requires org.xerial.sqlitejdbc;
    opens ru.gb.server to javafx.fxml;
}
