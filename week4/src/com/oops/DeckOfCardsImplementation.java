package com.oops;

import java.util.Random;

public class DeckOfCardsImplementation {
	public static String[][] cardDistribute() {
		String arr[][] = new String[4][13];
		cardInsert(arr);
		cardShuffle(arr);

		String playercard[][] = new String[4][9];
		for (int i = 0; i < playercard.length; i++) {
			for (int j = 0; j < playercard[i].length; j++) {
				playercard[i][j] = arr[i][j];
			}
		}
		return playercard;
	}

	public static void cardInsert(String arr[][]) {
		String Suits[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String Rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Suits[i] + " " + Rank[j];
			}
		}
	}

	public static void cardShuffle(String arr[][]) {
		Random r1 = new Random();
		for (int i = 0; i < 150; i++) {
			int x1 = r1.nextInt(4);
			int x2 = r1.nextInt(13);
			int x3 = r1.nextInt(4);
			int x4 = r1.nextInt(13);
			swap(arr, x1, x2, x3, x4);

		}
	}

	public static void swap(String arr[][], int x1, int x2, int x3, int x4) {
		String temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[x3][x4] = temp;
	}

	}
