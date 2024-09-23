package br.com.springjonatas.util;

import br.com.springjonatas.exception.ResourceNotFoundException;

public class CheckIfItIsANumber {

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null || strNumber.isEmpty()) {
			return false;
		}

		// Mudando o padrao Br de 10,50 para o padrao Eua 10.50
		String number = strNumber.replaceAll(",", ".");

		if (!number.matches("[-+]?[0-9]*\\.?[0-9+]")) {
			throw new ResourceNotFoundException("Please set a numeric value");
		} else {
			return number.matches("[-+]?[0-9]*\\.?[0-9+]");
		}
	}
}
