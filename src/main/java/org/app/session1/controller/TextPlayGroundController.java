package org.app.session1.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TextPlayGroundController {
    public Button appendBtn;
    public Button insertBtn;
    public Button replaceBtn;
    public TextField inputText;
    public TextField inputPosition;
    public TextArea textAreaOutput;

    public void onAppendBtnClick(ActionEvent actionEvent) {
        String inputTextVar = inputText.getText();
        textAreaOutput.appendText(inputTextVar);
    }

    public void onInsertBtnClick(ActionEvent actionEvent) {
        String inputTextVar = inputText.getText();
        int positionInsert = Integer.parseInt(inputPosition.getText());
        textAreaOutput.insertText(positionInsert, inputTextVar);
    }

    public void onReplaceBtnClick(ActionEvent actionEvent) {
        textAreaOutput.setText(inputText.getText());
    }
}
