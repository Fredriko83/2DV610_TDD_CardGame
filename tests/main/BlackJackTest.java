package main;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import view.ConsoleView;
import main.BlackJack;

public class BlackJackTest {
	
	private BlackJack sut;
	private ConsoleView view;	
	
	@Before
	public void setUp() throws Exception {
		view = mock(ConsoleView.class);
		sut = new BlackJack(view, null, null);
		
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
		verify(view).showQuit();
	}
	
	@Test
	public void shouldShowMenuAndFirstDeal() {
		when(view.userQuits()).thenReturn(false);
		sut.run();
		verify(view).showMenu();
		//verify(view).showFirstDeal(Mockito.any(),Mockito.any());
			
	}
}
