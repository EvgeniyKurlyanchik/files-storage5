module ru.gb.client {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.codec;
    requires lombok;
    requires io.netty.transport;
    requires ru.gb;
    opens ru.gb to javafx.fxml;
    exports ru.gb.client;
}
