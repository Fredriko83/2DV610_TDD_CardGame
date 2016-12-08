package model;

import java.util.ArrayList;

public class Dealer extends Player{
	
	public boolean dealerWins(Player player) {
		if(this.calcHandValue() > player.calcHandValue()){
			return true;
		} else{
			return false;
		} 
	}
}
