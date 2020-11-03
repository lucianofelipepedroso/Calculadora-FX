module br.luciano.felipe.calculadora{
	exports br.luciano.felipe.calculadora;

	requires transitive javafx.controls;
	requires javafx.fxml;
	
	requires javafx.base;
	requires javafx.graphics;

	
	opens br.luciano.felipe.calculadora.controller to javafx.fxml;
}