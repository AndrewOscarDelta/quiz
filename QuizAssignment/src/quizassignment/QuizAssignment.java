/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizassignment;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author andrewcastro
 */
public class QuizAssignment extends Application {
    Label lblQuestion, lblScore;
    TextField txt;
    Button btnSubmit, btnExit;
    Questions question = new Questions();
    
    
    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(800, 600); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        displayGUI(root);
        question.generate();
        lblQuestion.setText(question.getQuotien());
        // YOUR CODE STARTS HERE 
        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void displayGUI(Group root){
        lblQuestion = new Label("Q. This is a dummy Question");
        lblQuestion.setLayoutX(200);
        lblQuestion.setLayoutY(200);
        lblQuestion.setFont(new Font("Arial", 30));
        root.getChildren().add(lblQuestion);

        
        lblScore = new Label("0");
        lblScore.setLayoutX(680);
        lblScore.setLayoutY(15);
        root.getChildren().add(lblScore);
        
        txt = new TextField();
        txt.setLayoutX(275);
        txt.setLayoutY(450);
        txt.setPrefSize(100, 50);
        root.getChildren().add(txt);
        
        btnSubmit = new Button("Submit");
        btnSubmit.setLayoutX(425);
        btnSubmit.setLayoutY(450);
        btnSubmit.setPrefSize(100, 50);
        btnSubmit.setOnAction(this::checkAnswer);
        root.getChildren().add(btnSubmit);
        
        btnSubmit = new Button("Exit");
        btnSubmit.setLayoutX(15);
        btnSubmit.setLayoutY(15);
        btnSubmit.setPrefSize(50, 25);
        root.getChildren().add(btnSubmit);
        
        Text txtScore = new Text(620, 30, "Score: ");
        root.getChildren().add(txtScore);
    }
    
    public void checkAnswer(ActionEvent a){
        
        lblScore.setText(""+(Integer.parseInt(lblScore.getText())+1));
//        lblScore.setText(""+i);
    }
}
