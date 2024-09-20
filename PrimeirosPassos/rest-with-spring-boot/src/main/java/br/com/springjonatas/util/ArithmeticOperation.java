package br.com.springjonatas.util;

public class ArithmeticOperation {
	public Double operacaoSoma(String numberOne, String numberTwo) {
		return RefactorStringToDouble.convertToDouble(numberOne) + RefactorStringToDouble.convertToDouble(numberTwo);
	}

	public Double operacaoSubtracao(String numberOne, String numberTwo) {
		return RefactorStringToDouble.convertToDouble(numberOne) - RefactorStringToDouble.convertToDouble(numberTwo);
	}

	public Double operacaoMultiplicacao(String numberOne, String numberTwo) {
		return RefactorStringToDouble.convertToDouble(numberOne) * RefactorStringToDouble.convertToDouble(numberTwo);
	}

	public Double operacaoDivisao(String numberOne, String numberTwo) {
		return RefactorStringToDouble.convertToDouble(numberOne) / RefactorStringToDouble.convertToDouble(numberTwo);
	}

	public Double operacaoMedia(String numberOne, String numberTwo) {

		return (RefactorStringToDouble.convertToDouble(numberOne) + RefactorStringToDouble.convertToDouble(numberTwo))
				/ 2;
	}

	public Double operacaoRaisQuadrada(String numberOne) {

		return Math.sqrt(RefactorStringToDouble.convertToDouble(numberOne));
	}
}
