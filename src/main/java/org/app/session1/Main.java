package org.app.session1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.app.session1.controller.StringManipulation;
import org.app.session1.utils.ScreenLoader;
import org.app.session1.view.Calculator;
import org.app.session1.view.OptionPlayground;
import org.app.session1.view.TextPlayground;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/app/session1/view/Main.fxml"));

        ScreenLoader screenLoader = new ScreenLoader();
        screenLoader.LoadWindow(fxmlLoader, primaryStage);
    }

    public void onCalculatorClick() throws IOException {
        Calculator calculator = new Calculator();
        calculator.start(primaryStage);
    }


    public void onTextPlaygroundClick() throws IOException {
        TextPlayground textPlayground = new TextPlayground();
        textPlayground.start(primaryStage);
    }

    public void onOptionPlaygroundClick() throws IOException {
        OptionPlayground optionPlayground = new OptionPlayground();
        optionPlayground.start(primaryStage);
    }

    public void onStringManipulationCheck() throws IOException {
        StringManipulation stringManipulation = new StringManipulation();
        stringManipulation.start(primaryStage);
    }
}
