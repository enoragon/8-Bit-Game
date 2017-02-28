/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;

// imports

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Coins extends Application{

  @Override
  public void start(Stage primaryStage){    
    // Add panes and set alignment
    //Pane pane = new Pane();
    BorderPane pane = new BorderPane();
    HBox paneForGround = new HBox();
    
    Image image = new Image("image/guy.png");
    ImageView guy = new ImageView(image);
   
    paneForGround.getChildren().add(guy);
    pane.setBottom(paneForGround);
    
    PathTransition pt = new PathTransition(Duration.millis(5000), new Line (0,0,0,0), guy);
    pt.setCycleCount(Timeline.INDEFINITE);
    pt.play();
    
    Scene scene = new Scene(pane, 600, 500);
    primaryStage.setTitle("Coins"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  
//    scene.addEventHandler(e -> {
//        if (e.getCode() == KeyCode.LEFT){
//            pt.play();
//        }
//        if (e.getCode() == KeyCode.RIGHT) {
//            pt.play();
//        }
//    });
}
  
    public static void main(String[] args) {
        launch(args);
    }
    
}
