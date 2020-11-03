package br.luciano.felipe.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle("Calculadora FX");
		Parent root = FXMLLoader.load(getClass().getResource("/br/luciano/felipe/calculadora/resource/Layout.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("src/br/luciano/felipe/calculadora/resource/styles.css");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}

}
