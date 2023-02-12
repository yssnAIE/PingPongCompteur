package com.example.pingpong;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPP extends Stage {

    private PPController controller;

    public MainPP() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainPP.class.getResource("ping-pong.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 400);
        this.setTitle("Ping Pong!");
        this.setScene(scene);
        controller = fxmlLoader.getController();
    }

    public void setName(String name1, String name2) {
        controller.setName(name1, name2);
    }

}
