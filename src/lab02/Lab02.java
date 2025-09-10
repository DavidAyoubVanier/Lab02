/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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

        
        
        
        
        /* Label toplabel = new Label("Random Game");
        
        root.add(toplabel, 0, 0);
        
        */
    }
    
}
