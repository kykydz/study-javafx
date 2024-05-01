package org.app.session1.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.app.session1.utils.ScreenLoader;

import java.io.IOException;

public class StringManipulation extends Application {

    public Button checkPolindromButton;
    public TextField inputString;
    public TextField reversedString;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/app/session1/view/StringManipulation.fxml"));

        ScreenLoader screenLoader = new ScreenLoader();
        screenLoader.LoadChildWindow(fxmlLoader, primaryStage);
    }

    public void onCheckPalindrome() {
        String inputS = inputString.getText();
        StringBuilder reversedS = new StringBuilder();
        for (int i = inputS.length() - 1; i >= 0; i--) {
            char c = inputS.charAt(i);
            reversedS.append(c);
        }
        if (reversedS.toString().equals(inputS)) {
            reversedString.setText("is a palindrome");
        } else {
            reversedString.setText("is not palindrome");
        }
    }

}
