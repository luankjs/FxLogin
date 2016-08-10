package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		try {
			AnchorPane pane = new AnchorPane();
			pane.setPrefSize(400, 300);
			
			TextField txLogin = new TextField();
			txLogin.setPromptText("Digite aqui seu login");
			PasswordField txPassword = new PasswordField();
			txPassword.setPromptText("Digite aqui sua senha");
			Button btLogin = new Button("Entrar");
			Button btExit = new Button("Sair");
			pane.getChildren().addAll(txLogin, txPassword, btLogin, btExit);
			
			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.show();
			
			txLogin.setLayoutX((pane.getWidth()-txLogin.getWidth())/2);
			txLogin.setLayoutY(50);
			txPassword.setLayoutX((pane.getWidth()-txPassword.getWidth())/2);
			txPassword.setLayoutY(100);
			btLogin.setLayoutX((pane.getWidth()-btLogin.getWidth())/2);
			btLogin.setLayoutY(150);
			btExit.setLayoutX((pane.getWidth()-btExit.getWidth())/2);
			btExit.setLayoutY(200);
			pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
