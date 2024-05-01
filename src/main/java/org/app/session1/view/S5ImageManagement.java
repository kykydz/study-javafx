package org.app.session1.view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.app.session1.utils.ScreenLoader;

import java.io.IOException;

public class S5ImageManagement extends Application {
    @FXML
    private Text myText = new Text();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {


//        String text = "This is a custom Text node";
//        myText.setText(text);
//
//        if (myText != null) {
//            System.out.println("Text content: " + myText.getText());
//        } else {
//            System.out.println("myText is null!");
//        }
//        Paint fillPaint = Color.RED;
//
//        myText.setFont(Font.font("Arial", 24));
//        myText.setFill(fillPaint);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/app/session1/view/S5ImageManagement.fxml"));

        ScreenLoader screenLoader = new ScreenLoader();
        screenLoader.LoadChildWindow(fxmlLoader, primaryStage);


//        myText.setText(text);
//
//        if (myText != null) {
//            System.out.println("Text content: " + myText.getText());
//        } else {
//            System.out.println("myText is null!");
//        }
//
//        myText.setFont(Font.font("Arial", 24));
//        myText.setFill(fillPaint);
    }
}
