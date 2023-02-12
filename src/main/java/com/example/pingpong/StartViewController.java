package com.example.pingpong;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StartViewController {

    private Jeu jeu;

    @FXML
    private Button BtnCommencez;

    @FXML
    private TextField LabelPseudo1;

    @FXML
    private TextField LabelPseudo2;

    @FXML
    void BtnClicked(ActionEvent event) throws IOException {
        System.out.println("Button clicked!");
        String pseudo1 = LabelPseudo1.getText();
        String pseudo2 = LabelPseudo2.getText();
        jeu.startGame(pseudo1, pseudo2);
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }
}
