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
		
	}

	@Test
	public void shouldShowMenu() {
		sut.run();
		verify(view).showMenu();
		
	}
	
	@Test
	public void shouldShowMenuAndQuit() {
		when(view.userQuits()).thenReturn(true);
		sut.run();
		verify(view).showMenu();
		verify(view, never()).showBetting();
		verify(view).showQuit();
	}
	
	@Test
	public void shouldShowMenuAndBetting() {
		when(view.userQuits()).thenReturn(false);
		sut.run();
		verify(view).showMenu();
		verify(view).showBetting();		
	}
}
