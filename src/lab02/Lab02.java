/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.util.Random;
/**
 *
 * @author 6321852
 */
public class Lab02 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the stage title
        primaryStage.setTitle("Java Games");
        
        // Show the window
        BorderPane root = new BorderPane();
        Scene s = new Scene(root, 250, 300);
        primaryStage.setScene(s);
        primaryStage.show();
        
        StackPane middle = new StackPane();
        Label top = new Label("Random Game");
        Label bottom = new Label("Waiting...");
        Label lblImage = new Label("");
        root.setTop(top);
        root.setBottom(bottom);
        middle.getChildren().addAll(lblImage);
        root.setCenter(middle);
        
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 101;
        String filePath = "file:images\\"   + randomNumber + ".jpg";
        Image img = new Image(filePath);
        lblImage.setGraphic(new ImageView(img));
    }
    
}
