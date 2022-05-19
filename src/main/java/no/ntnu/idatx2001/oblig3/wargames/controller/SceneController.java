package no.ntnu.idatx2001.oblig3.wargames.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        URL url = getClass().getResource("Scene1.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        Parent root = fxmlLoader.load();


        /*root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Untitled1.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (NullPointerException e) {
            System.out.println(" Yolo");
        }
    }
}
