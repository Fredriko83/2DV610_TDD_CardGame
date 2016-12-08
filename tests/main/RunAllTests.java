package main;


	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;
	import org.junit.runners.Suite.SuiteClasses;

import model.*;
import view.ConsoleViewTest;


	@RunWith(Suite.class)
	@SuiteClasses({CardTest.class,DeckTest.class,PlayerTest.class,BlackJackTest.class,ConsoleViewTest.class})
	public class RunAllTests {}
