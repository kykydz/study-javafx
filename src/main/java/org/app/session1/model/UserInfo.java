package org.app.session1.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.List;

public class UserInfo {

    private String name;
    private String address;
    private SimpleStringProperty gender = new SimpleStringProperty();
    private List<String> enrolledCourses;

    public UserInfo(String name, String address, String gender, List<String> enrolledCourses) {
        this.name = name;
        this.address = address;
        this.gender = new SimpleStringProperty(gender);
        this.enrolledCourses = enrolledCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender.get(); // Use get method to access StringProperty value
    }

    public void setGender(String gender) {
        this.gender.set(gender); // Use set method to update StringProperty value
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
