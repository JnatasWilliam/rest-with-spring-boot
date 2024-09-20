package br.com.springjonatas.util;

public class RefactorStringToDouble {

	public static Double convertToDouble(String strNumber) {
		if (strNumber == null || strNumber.isEmpty()) {
			return 0D;
		}

		/*
		 * No Br o formato numerico é 10,25 Nos EUA é 10.25. Pra funcionar das duas
		 * maneira usamos o replace que vai substituir tudo pra o padrão EUA
		 */
		String number = strNumber.replaceAll(",", ".");
		if (CheckIfItIsANumber.isNumeric(number)) {
			return Double.parseDouble(number);
		}

		return null;
	}
}
