package model;

import view.ConsoleView;

public class Card {
		
	private String value;
	private String suite;
	
	public Card(String value, String suite) {
		this.value = value;
		this.suite = suite;
	}

	public Object getValue() {
		return this.value;
	}
	
}
