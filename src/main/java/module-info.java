module org.app.session1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.app.session1 to javafx.fxml;
    exports org.app.session1;
    exports org.app.session1.controller;
    opens org.app.session1.controller to javafx.fxml;
    exports org.app.session1.view;
    exports org.app.session1.model;
    opens org.app.session1.view to javafx.fxml;
}