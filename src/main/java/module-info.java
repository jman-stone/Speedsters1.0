module com.example.speedsters1_0 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.speedsters1_0 to javafx.fxml;
    exports com.example.speedsters1_0;
}