package com.mind2codes.gsemaquis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmailExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3120270025352987525L;
	
	public EmailExistsException() {
		super();
    }

    public EmailExistsException(String message) {
    	super(message);
    }

	public EmailExistsException(String message, Throwable cause) {
	    super(message, cause);
	}

}