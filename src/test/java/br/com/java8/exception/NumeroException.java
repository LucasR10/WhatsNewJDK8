package br.com.java8.exception;

public class NumeroException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	@Override
	public String getLocalizedMessage() {
		return "N�o foi permitido exce��o";
	}
}
