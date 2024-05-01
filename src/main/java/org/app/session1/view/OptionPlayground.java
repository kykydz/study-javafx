package org.app.session1.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.app.session1.utils.ScreenLoader;

import java.io.IOException;

public class OptionPlayground extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/app/session1/view/OptionPlayground.fxml"));
        ScreenLoader screenLoader = new ScreenLoader();
        screenLoader.LoadChildWindow(fxmlLoader, primaryStage);
    }
}
