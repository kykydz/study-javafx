package org.app.session1.controller;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.app.session1.utils.ScreenLoader;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class MathAndDate {

    public static void main(String[] args) {
        List<String> days = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the current date and time along with the days of the week
        System.out.println("Current Date and Time: " + formattedDateTime);
        System.out.println("Days of the Week: " + days);

        System.out.println(factorial(4, 0));
    }

    public static Integer factorial(int number, int total) {
        if (number == 0) {
            return total;
        }
        int nextIterationNumber = number - 1;
        total = number * nextIterationNumber;
        return factorial(nextIterationNumber, total);
    }
}
