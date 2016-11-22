package main;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import view.ConsoleView;
import main.BlackJack;

public class BlackJackTest {
	
	private BlackJack sut;	
	
	@Before
	public void setUp() throws Exception {		
	}

	@Test
	public void shouldShowMenu() {
		ConsoleView view = mock(ConsoleView.class);
		sut = new BlackJack(view);
		sut.run();
		
		verify(view).showMenu();
	}
	
	public void shouldShowMenuAndQuit() {
		ConsoleView view = mock(ConsoleView.class);
		sut = new BlackJack(view);
		sut.run();
		
		verify(view).showMenu();
		verify(view).showQuit();
	}

}
