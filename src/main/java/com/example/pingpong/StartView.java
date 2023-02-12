package com.example.pingpong;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartView extends Stage {

    private StartViewController controller;

    public StartView(Jeu jeu) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainPP.class.getResource("StartView.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 400);
        this.setTitle("Ping Pong!");
        this.setScene(scene);
        controller = fxmlLoader.getController();
        controller.setJeu(jeu);
    }

}
