package com.capgemini.Book.exceptions;

@SuppressWarnings("serial")
public class PriceIsNotValidExeption extends Exception {
	public PriceIsNotValidExeption(String msg){
		super(msg);
	}

}