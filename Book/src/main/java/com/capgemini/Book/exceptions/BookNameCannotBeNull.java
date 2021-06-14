package com.capgemini.Book.exceptions;

@SuppressWarnings("serial")
public class BookNameCannotBeNull extends Exception {

	public BookNameCannotBeNull(String msg){
		super(msg);
	}

}
