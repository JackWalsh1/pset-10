package application;

import com.google.gson.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

 
public class Dictionary extends Application implements EventHandler<ActionEvent> {
    
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
	
	Button btn;
	
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        btn = new Button("Add");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        btn.setOnAction(this);
        
        Button btn2 = new Button("Add");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 4);
        btn.setOnAction(this);

        Scene scene = new Scene(grid, 1000, 1000);

        primaryStage.setTitle("Jack's Dictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
 public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == btn) {
			System.out.println("Test");
		}
			
		
	}

}