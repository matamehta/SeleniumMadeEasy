package com.seleniummadeeasy.exceptions;

import org.openqa.selenium.NotFoundException;

public class NoSuchAttributeException extends NotFoundException{
	
	public NoSuchAttributeException() {
		this("Desired attribute is not present");
	}
	
	public NoSuchAttributeException(String message) {
		super(message);
	}

}
