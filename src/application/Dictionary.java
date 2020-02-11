package application;

import com.google.gson.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Dictionary extends Application {
    
	/*constant features
	 * Add / Remove Buttons
	 * Search Bar
	 * Asc / Desc buttons for word sorting (only one clicked at a time)
	 * Word Box on Side
	 * Scroll Bar
	 * Display box on right side (info changes) (Main panel)
	 */
	
	/*dynamic features
	 * Word Definitions / Antonyms / PoS / Synonyms
	 * Placeholder Messages for No / > 1 Word Selected
	 * Add word screen to main panel
	 * Dialog Box for Removing Words
	 * 
	 */
	
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 1000, 1000);

        primaryStage.setTitle("Jack's Dictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
 public static void main(String[] args) {
        launch(args);
    }
}