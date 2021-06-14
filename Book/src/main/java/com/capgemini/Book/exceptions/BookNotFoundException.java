package com.capgemini.Book.exceptions;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {
	
	public BookNotFoundException(String msg){
		super(msg);
	}

}
