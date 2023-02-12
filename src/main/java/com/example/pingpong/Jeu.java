package com.example.pingpong;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Jeu extends Application {

    private StartView startView;
    private MainPP mainPP;

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Starting...");
        getNames();
    }

    public static void main(String[] args) {
        launch();
    }

    public void startGame(String name1, String name2) throws IOException {

        startView.close();
        mainPP = new MainPP();
        mainPP.show();
        mainPP.setName(name1, name2);
    }

    public void getNames() throws IOException {
        startView = new StartView(this);
        startView.show();
    }
}
