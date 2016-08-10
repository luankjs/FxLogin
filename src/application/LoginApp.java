package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		try {
			AnchorPane pane = new AnchorPane();
			pane.setPrefSize(400, 300);
			
			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
