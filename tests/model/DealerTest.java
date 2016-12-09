package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.Spy;

public class DealerTest {
	
	@Mock private Player player;
	//@Mock private Deck m_deck;
	@Mock private Card card;	
	@Spy private ArrayList<Card> m_hand;
	
	@InjectMocks private Dealer sut;
	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}
	
	@Test
	public void dealerWinsWithHigherCards() {
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Ten");
		sut.addDealtCard(card);
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Queen");
		sut.addDealtCard(card);
		
		player = mock(Player.class);
		when(player.calcHandValue()).thenReturn(19);
		
		assertEquals("Wrong Winner", "Dealer", sut.dealerWins(player));
	}
	
	@Test
	public void dealerWinsOverFatPlayerWhenUnder21() {
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Ten");
		sut.addDealtCard(card);
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Queen");
		sut.addDealtCard(card);
		
		player = mock(Player.class);
		when(player.calcHandValue()).thenReturn(22);
		
		assertEquals("Wrong Winner", "Dealer", sut.dealerWins(player));
	}
	
	@Test
	public void pushOnSameScore() {
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Ten");
		sut.addDealtCard(card);
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Queen");
		sut.addDealtCard(card);
		
		player = mock(Player.class);
		when(player.calcHandValue()).thenReturn(20);
		
		assertEquals("Wrong Winner", "Push", sut.dealerWins(player));
	}
	
	@Test
	public void playerWinsOnBetterCards() {
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Ten");
		sut.addDealtCard(card);
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Queen");
		sut.addDealtCard(card);
		
		player = mock(Player.class);
		when(player.calcHandValue()).thenReturn(21);
		
		assertEquals("Wrong Winner", "Player", sut.dealerWins(player));
	}
	
	@Test
	public void playerWinsWhenDealerGoesBust() {
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Ten");
		sut.addDealtCard(card);
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Queen");
		sut.addDealtCard(card);
		card = mock(Card.class);
		when(card.getValue()).thenReturn("Two");
		sut.addDealtCard(card);
		
		player = mock(Player.class);
		when(player.calcHandValue()).thenReturn(20);
		
		assertEquals("Wrong Winner", "Player", sut.dealerWins(player));
	}
}
