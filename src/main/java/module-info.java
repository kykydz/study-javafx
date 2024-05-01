module org.app.pagtask {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.app.pagtask to javafx.fxml;
    exports org.app.pagtask;
}