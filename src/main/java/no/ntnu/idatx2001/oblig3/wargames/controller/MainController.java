package no.ntnu.idatx2001.oblig3.wargames.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import no.ntnu.idatx2001.oblig3.wargames.Battle;

public class MainController {
    private Battle battle;

    @FXML
    private VBox army1box;

    @FXML
    private Label cavalryUnit1;

    @FXML
    private Label commanderUnit1;

    @FXML
    private Label rangedUnit1;

    @FXML
    private Label infantryUnit1;

    @FXML
    private VBox army2box;

    @FXML
    private Label unit2;

    @FXML
    private GridPane grid;

    @FXML
    private Button button;

    @FXML
    private Label armys_left1;

    @FXML
    private Label armys_left2;


    public MainController() {
    }

  /*  *//**
     * Metoden får de ulike unitene til å bevege seg til midten
     *//*
    public void setButtonFunctions() {
        button.setOnAction(actionEvent -> {
            if (!grid.getChildren().contains(cavalryUnit1)
            ) {
                grid.add(cavalryUnit1, 0,0);
            } else {
                army1box.getChildren().add(cavalryUnit1);
            }
        });*/


    public void setButtonOnAction() {
        button.setOnAction(actionEvent -> {
            battle.simulate();
        });
    }






}
