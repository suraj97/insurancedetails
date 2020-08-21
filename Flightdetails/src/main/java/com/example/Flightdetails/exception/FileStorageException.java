package com.example.Flightdetails.exception;

public class FileStorageException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FileStorageException(String message){
		super(message);
	}

	public FileStorageException(String message, Throwable t) {
		super(message, t);
	}
}
