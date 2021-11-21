package com.deck_of_cards;

public class Cards_Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Cards program for 4 player");

		String players[][] = new String[4][9];
		Deck_Of_Cards call = new Deck_Of_Cards();
		
		call.displayCards();
		call.checkRandom(players);
		call.display(players);
		
			}
		}



