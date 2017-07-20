package com.seleniummadeeasy.exceptions;

import org.openqa.selenium.NotFoundException;

public class NoHeaderFoundException extends NotFoundException {
	
	public NoHeaderFoundException() {
		this("Header for given table locaor is not present");
	}

	public NoHeaderFoundException(String message) {
		super(message);
	}
}
