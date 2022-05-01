module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires io.netty.transport;
    requires io.netty.codec;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires org.slf4j;
    requires jbcrypt;
    opens org.example to javafx.fxml;

    exports org.example.clientside;
    opens org.example.clientside to javafx.fxml;
}
