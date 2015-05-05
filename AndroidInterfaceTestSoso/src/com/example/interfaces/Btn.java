package com.example.interfaces;

public class Btn {
	TextChanged listener;

	public void click() {
		listener.setTextChange();
	}
	public void setTextChanged(TextChanged listener) {
		this.listener = listener;
	}
}