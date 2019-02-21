package com.oops;

/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim Runner class for deck of cards
 */
public class DeckOfCards {
	public static void main(String[] args) {
		String playercard[][] = DeckOfCardsImplementation.cardDistribute();
		System.out.println("Player1 \t Player2 \t Player3 \t Player4");
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(playercard[x][y] + " \t ");
				y++;
				if (y == 9) {
					y = 0;
					x++;
				}
			}
			System.out.println();
		}

	}

}
