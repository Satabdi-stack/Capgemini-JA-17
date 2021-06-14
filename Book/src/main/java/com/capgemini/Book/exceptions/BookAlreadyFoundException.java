package com.capgemini.Book.exceptions;

@SuppressWarnings("serial")
public class BookAlreadyFoundException extends Exception {
	
	public BookAlreadyFoundException(String msg){
		super(msg);
	}

}
