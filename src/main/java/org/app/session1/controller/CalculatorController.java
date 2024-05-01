package org.app.session1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.app.session1.utils.General;

public class CalculatorController {
    public Button calculateSquare;
    public Button oddEvenApp;
    public Label oddEvenResultLabel;
    public TextField oddEvenInput;
    public Button calculateSquareBtn;
    public TextField widthInput;
    public TextField heightInput;
    public Label largeResultLabel;
    public Label aroundResultLabel;
    public TextField factorialNumberInput;
    public Label factorialNumberLabel;
    public Button checkFactorialBtn;

    @FXML
    public void onCheckNumberTaskClick() {
        int num = Integer.parseInt(oddEvenInput.getText());
        if (num % 2 == 0) {
            oddEvenResultLabel.setText("Result : Even");
        } else {
            oddEvenResultLabel.setText("Result : Odd");
        }
    }

    @FXML
    public void onCalculateSquareClick() {
        int width = Integer.parseInt(widthInput.getText());
        int height = Integer.parseInt(heightInput.getText());

        int large = width * height;
        int around = 2 * (width + height);

        String resLarge = "Large : " + String.valueOf(large);
        largeResultLabel.setText(resLarge);

        String resAround = "Around : " + String.valueOf(around);
        aroundResultLabel.setText(resAround);
    }

    public void onCheckFactorialBtnClick(ActionEvent actionEvent) {
        int number = Integer.parseInt(factorialNumberInput.getText());
        int resultFactorial = General.factorial(number, 0);

        factorialNumberLabel.setText("Result: " + String.valueOf(resultFactorial));

    }
}