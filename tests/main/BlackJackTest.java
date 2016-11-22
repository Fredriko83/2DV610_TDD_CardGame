package main;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import view.ConsoleView;
import main.BlackJack;

public class BlackJackTest {
	
	private BlackJack sut;
	private ConsoleView view;	
	
	@Before
	public void setUp() throws Exception {
		view = mock(ConsoleView.class);
		sut = new BlackJack(view);
		sut.run();
	}

	@Test
	public void shouldShowMenu() {
		
		verify(view).showMenu();
	}
	
	@Test
	public void shouldShowMenuAndQuit() {
		
		verify(view).showMenu();
		verify(view).showQuit();
	}

}
