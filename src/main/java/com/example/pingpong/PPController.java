package com.example.pingpong;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PPController {

    @FXML
    private Label CompteurJ1;

    @FXML
    private Label CompteurJ2;

    @FXML
    private Label name1;

    @FXML
    private Label name2;


    @FXML
    void BtnClickMoins1(ActionEvent event) {
        int i = Integer.parseInt(CompteurJ1.getText());
        i--;
        CompteurJ1.setText(String.valueOf(i));
    }

    @FXML
    void BtnClickMoins2(ActionEvent event) {
        int i = Integer.parseInt(CompteurJ2.getText());
        i--;
        CompteurJ2.setText(String.valueOf(i));
    }

    @FXML
    void BtnClickPlus1(ActionEvent event) {
        int i = Integer.parseInt(CompteurJ1.getText());
        i++;
        CompteurJ1.setText(String.valueOf(i));
    }

    @FXML
    void BtnClickPlus2(ActionEvent event) {
        int i = Integer.parseInt(CompteurJ2.getText());
        i++;
        CompteurJ2.setText(String.valueOf(i));
    }

    @FXML
    void BtnClickReset(ActionEvent event) {
        CompteurJ1.setText("0");
        CompteurJ2.setText("0");
    }

    public void setName(String name1, String name2) {
        this.name1.setText(name1);
        this.name2.setText(name2);
    }
}
