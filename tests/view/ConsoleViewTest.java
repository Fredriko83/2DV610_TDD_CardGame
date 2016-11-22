package view;

import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ConsoleViewTest {

	private ConsoleView sut;
	private PrintStream printStream;

	@Before
	public void setUp() throws Exception {
		printStream = Mockito.mock(PrintStream.class);
		sut = new ConsoleView(printStream);
	}

	@Test
	public void shouldShowMenu() {
		
		sut.showMenu();
		
		verify(printStream).println(ConsoleView.MENU);
		
	}
	
	@Test
	public void shouldShowQuit() {
		PrintStream printStream = Mockito.mock(PrintStream.class);
		
		sut = new ConsoleView(printStream);
		sut.showQuit();
		
		verify(printStream).println(ConsoleView.QUIT);
		
	}

}
