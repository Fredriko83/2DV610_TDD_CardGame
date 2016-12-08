package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mock;

public class DealerTest {

	private Dealer sut;
	@Mock private Deck testDeck;
	
	  @Test
	  public void getHand() {
	    Dealer sut = new Dealer(testDeck);
	    assertEquals(true, sut.getHand() instanceof ArrayList);
	  }
}
