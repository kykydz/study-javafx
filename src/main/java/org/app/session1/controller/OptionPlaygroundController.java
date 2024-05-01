package org.app.session1.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import org.app.session1.model.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class OptionPlaygroundController {

    public CheckBox checkLocal;
    public CheckBox checkInter;
    public Button submitBtn;
    public TextField inputName;
    public TextField inputAddress;

    public ToggleGroup rbGenderGroup;
    public TextArea outputTextArea;
    public TableColumn<UserInfo, String> colName;
    public TableColumn<UserInfo, String> colAddress;
    public TableColumn<UserInfo, String> colGender;
    public TableColumn<UserInfo, String> colEnrolledCourse;
    public Button insertRowBtn;

    public TableView<UserInfo> tableViewUserData;

    private ObservableList<UserInfo> userInfos;

    public void initialize() {
        initializeTable();
    }

    private void initializeTable() {
        userInfos = FXCollections.observableArrayList();
        tableViewUserData.setItems(userInfos);

        colName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        colAddress.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAddress()));
        colGender.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGender()));
        colEnrolledCourse.setCellValueFactory(cellData -> {
            List<String> courses = cellData.getValue().getEnrolledCourses();
            return new SimpleStringProperty(String.join(", ", courses));
        });
    }

    public void onSubmitClick() {
        UserInfo userInfo = _getUserInfo();
        String identityText =
            userInfo.getName() + " \n" +
            userInfo.getAddress() + " \n" +
            userInfo.getGender() + " \n" +
            String.join(", ", userInfo.getEnrolledCourses());
        outputTextArea.setText(identityText);
    }

    public void onInsertRow() {
        UserInfo userInfo = _getUserInfo();
        userInfos.add(userInfo);
    }

    private UserInfo _getUserInfo() {
        String name = inputName.getText();
        String address = inputAddress.getText();
        String gender = _getSelectedGender();
        CheckBox[] checkBoxArray = {checkLocal, checkInter};
        List<String> enrolledCourses = _getEnrolledCourse(checkBoxArray);
        return new UserInfo(name, address, gender, enrolledCourses);
    }

    private String _getSelectedGender() {
        RadioButton selectedRadio = (RadioButton) rbGenderGroup.getSelectedToggle();
        if (selectedRadio != null) {
            return selectedRadio.getText();
        } else {
            return null;
        }
    }

    private List<String> _getEnrolledCourse(CheckBox[] checkBoxes) {
        List<String> enrolledCourses = new ArrayList<>();
        for (CheckBox checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                enrolledCourses.add(checkBox.getText());
            }
        }
        return enrolledCourses;
    }
}
