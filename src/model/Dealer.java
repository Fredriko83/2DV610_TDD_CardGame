package model;

import java.util.ArrayList;

public class Dealer extends Player{
	
	public String dealerWins(Player player) {
		if(this.calcHandValue() == player.calcHandValue()){
			return "Push";
		}
		if(this.calcHandValue()>21 && player.calcHandValue()<=22){
			return "Player";
		}
		if(player.calcHandValue()>21 && this.calcHandValue()<=22){
			return "Dealer";
		}
		if(this.calcHandValue() > player.calcHandValue()){
			return "Dealer";
		} else{
			return "Player";
		} 
	}
}
