package model;

public class Card {

	public enum Value {
		Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Knight, Queen, King, Ace
	}

	public enum Suite {
		Hearts, Spades, Diamonds, Clubs
	}

	private int cardValue;

	private Value value;
	private Suite suite;

	public Card(Value value, Suite suite) {
		if(value == null){
			throw new IllegalArgumentException("Argument can't be null");
		}
		
		this.value = value;
		this.suite = suite;
	}

	public Object getValue() {
		return this.value;
	}

}
