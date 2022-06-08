package ru.gb.networkchat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userInput;


    public void clickSendButton(ActionEvent actionEvent) {
        final String userInp = userInput.getText();
        historyArea.appendText(userInp + "\n");
        userInput.clear();
        userInput.requestFocus();
    }
}