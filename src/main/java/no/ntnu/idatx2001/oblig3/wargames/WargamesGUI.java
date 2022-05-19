package no.ntnu.idatx2001.oblig3.wargames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import no.ntnu.idatx2001.oblig3.wargames.controller.MainController;

import java.io.IOException;
import java.net.URL;

public class WargamesGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = getClass().getResource("Untitled1.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        //MainController mainController = new MainController();
        //fxmlLoader.setController(mainController);
        Parent root = fxmlLoader.load();
        //mainController.setButtonFunctions();
        primaryStage.setTitle("Wargames");

        BorderPane rootNode = new BorderPane();
        rootNode.setMinSize(500, 300);
        rootNode.setPadding(new Insets(10, 10, 10, 10));


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

      /*  try {

            Parent root = FXMLLoader.load(getClass().getResource("Untitled1.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }*/

    }
}