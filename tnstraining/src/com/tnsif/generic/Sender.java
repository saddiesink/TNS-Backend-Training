package com.tnsif.generic;

public class Sender<T>{
	private T message;
	public void setMessage(T message) {
		this.message=message;
		
	}
	public T getMessage() {
		return message;
	}
	

}
