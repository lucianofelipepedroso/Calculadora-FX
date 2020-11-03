package br.luciano.felipe.calculadora.model;

public enum Operation {

	SUM('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), EQUALS('=');

	private char symbol;

	private Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public double apply(double n1, double n2) {

		if (this == Operation.SUM) {
			return n1 + n2;
		} else if (this == Operation.SUBTRACT) {
			return n1 - n2;
		} else if (this == Operation.MULTIPLY) {
			return n1 * n2;
		} else if (this == Operation.DIVIDE) {
			return n1 / n2;
		}

		throw new UnsupportedOperationException("O operador + " + symbol + "não suporte essa operação");
	}

	public static Operation fromSymbol(char symbol) {

		for (Operation o : Operation.values()) {

			if (o.getSymbol() == symbol) {
				return o;
			}

		}
		return null;

	}
}
