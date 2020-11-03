package br.luciano.felipe.calculadora.controller;

import br.luciano.felipe.calculadora.model.CalcModel;
import br.luciano.felipe.calculadora.model.Operation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.converter.NumberStringConverter;

public class Controller {

	@FXML
	private Label lblResult;

	@FXML
	private Label lblError;

	private CalcModel calcModel = new CalcModel();

	public void initialize() {
		lblResult.textProperty().bindBidirectional(calcModel.getCurrentValueProperty(), new NumberStringConverter(CalcModel.NUMBER_FORMAT));
		lblError.visibleProperty().bind(calcModel.errorProperty());
	}

	@FXML
	public void onOperation(ActionEvent event) {
		Button button = (Button) event.getTarget();
		Operation operation = Operation.fromSymbol(button.getText().charAt(0));
		calcModel.doOperation(operation);
	}

	@FXML
	public void onNumber(ActionEvent event) {
		Button button = (Button) event.getTarget();
		int number = Integer.parseInt(button.getText());
		calcModel.appendNumber(number);
	}

	@FXML
	public void onClear() {
		calcModel.clear();
	}

	@FXML
	public void onComma() {
		calcModel.appendComma();
	}

}
