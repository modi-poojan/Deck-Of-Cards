package com.deck_of_cards;

public class Deck_Of_Cards {
	
	String [][] total_cards = new String [4][13];
	String [] total_cards_distributed = new String [36];
	int count = 0;
	
	public Deck_Of_Cards() {
		
		
		String [] suits =  {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		for(int i = 0; i< suits.length; i++) {
			for(int j = 0; j< rank.length; j++) {
				
				total_cards[i][j] = "(" + suits[i] + " " + rank[j] + ")";
				//System.out.println(total_cards[i][j]);
			}
		}
	}
	
	public void checkRandom(String[][] players) {
		
		int rank;
		int suits;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				rank = (int)( Math.random() * 13 );
				suits = (int)( Math.random() * 4 );
				
				if ( !check(total_cards[suits][rank]) ) {
					j--;
					continue;
				}
				players[i][j] = total_cards[suits][rank];
				distribute(total_cards[suits][rank]);
			}
		}
	}
	
	public void display(String [][] players) {
			for (int i = 0; i < 4; i++) {
				System.out.print("\n Player " + (i + 1) + " has: ");
				for (int j = 0; j < 4; j++) {
					System.out.print(" " + players[i][j]);
				}
			}
		}
	
	public void displayCards() {
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.print(" " + total_cards[i][j]);
			}
			System.out.println();
		}
	}
	
	public void distribute(String card) {
		System.out.println(" assorting " + card);
		total_cards_distributed[count++] = card;
	}
	
	public boolean check(String pickedCard) {
		for (int i = 0; i < count; i++) {
			if(total_cards_distributed[i].equals(pickedCard)) {
				System.out.println(" repeated found " + pickedCard);
				return false;
			}
		}
		return true;
	}
		
	

}
