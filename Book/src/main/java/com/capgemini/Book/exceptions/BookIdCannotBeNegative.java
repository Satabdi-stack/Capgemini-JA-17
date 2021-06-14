package com.capgemini.Book.exceptions;

@SuppressWarnings("serial")
public class BookIdCannotBeNegative extends Exception {
	public BookIdCannotBeNegative(String msg){
		super(msg);
	}

}
