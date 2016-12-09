package model;

import java.util.ArrayList;

public class Dealer extends Player{
	
	public boolean dealerWins(Player player) {
		if(this.calcHandValue()>21 && player.calcHandValue()<=22){
			return false;
		}
		if(player.calcHandValue()>21 && this.calcHandValue()<=22){
			return true;
		}
		if(this.calcHandValue() > player.calcHandValue()){
			return true;
		} else{
			return false;
		} 
	}
}
