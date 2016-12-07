package model;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

//@RunWith(MockitoJUnitRunner.class)
public class DeckTest {
		
	@Mock private ArrayList<Card> cards;
    @Mock private Card card;
	@Mock private CardFactory CF;
    
    @InjectMocks private Deck sut;
		
	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}	
	
	@Test	
	public void DeckContains52Cards() {		
		Mockito.when(CF.createCard(Mockito.any(), Mockito.any())).thenReturn(card);		
		sut.init();		
		verify(cards, Mockito.times(52)).add(Mockito.any());
	}
	
	@Test	
	public void getCardIsCalled() {		
		sut.getCard();
		verify(cards).remove(0);		
	}
	
	@Test	
	public void cardsLeftIsCalled() {		
		sut.cardsLeft();		
		verify(cards).size();		
	}
	
	@Test	
	public void getLastCardIsCalled() {		
		sut.getLastCard();
		verify(cards).size();		
	}	
}