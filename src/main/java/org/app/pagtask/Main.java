package org.app.pagtask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.app.pagtask.utils.ScreenLoader;

import java.io.IOException;

public class Main extends Application {
    public Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/app/pagtask/Main.fxml"));

        ScreenLoader screenLoader = new ScreenLoader();
        screenLoader.LoadWindow(fxmlLoader, primaryStage);
    }

    public static void main(String[] args) {
        launch();
    }
}