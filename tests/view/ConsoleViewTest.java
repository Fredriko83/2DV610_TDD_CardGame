package view;

import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ConsoleViewTest {

	private ConsoleView sut;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldShowMenu() {
		PrintStream printStream = Mockito.mock(PrintStream.class);
		
		sut = new ConsoleView(printStream);
		sut.showMenu();
		
		verify(printStream).println(ConsoleView.MENU);
		
	}

}
