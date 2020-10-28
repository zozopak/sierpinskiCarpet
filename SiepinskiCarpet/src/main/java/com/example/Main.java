package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    public static void main(String[] args) {
         launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

      Pane pane=new Pane();
      Scene scene=new Scene(pane,600,600);
      stage.setScene(scene);
      stage.show();
      drawCarpet(pane,0,0,600);
    }
    public void drawCarpet(Pane root,int x,int y,int side){
        int subside=side/3;
        Rectangle rectangle=new Rectangle(x+subside,y+subside,subside,subside);

        root.getChildren().addAll(rectangle);
        if(subside>50){
            rectangle.setFill(Color.MAGENTA);
        }
        if(subside>=3){
            drawCarpet(root,x,y,subside);
            drawCarpet(root,x+2*subside,y,subside);
            drawCarpet(root,x+2*subside,y+subside,subside);
            drawCarpet(root,x+2*subside,y+2*subside,subside);
            drawCarpet(root,x+subside,y,subside);
            drawCarpet(root,x,y+subside,subside);
            drawCarpet(root,x+subside,y+2*subside,subside);
            drawCarpet(root,x,y+2*subside,subside);
        }
    }
}
