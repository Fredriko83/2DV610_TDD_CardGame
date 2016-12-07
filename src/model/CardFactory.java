package model;

public class CardFactory {

	public Card createCard(Card.Value value, Card.Suite suite){
		return new Card(value, suite);
		
	}


}
