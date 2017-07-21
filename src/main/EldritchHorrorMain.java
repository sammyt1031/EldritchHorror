package main;

import java.util.*;

import gameObjects.*;
import gameObjects.gameTokens.AncientOne;

public class EldritchHorrorMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Eldritch Horror!");
		
		Scanner scanner = new Scanner(System.in);
				
		int option = 0;
		System.out.println("What would you like to do");
		System.out.println("1. Start a new game");
		System.out.println("2. Load a game from a save file");
		System.out.println("3. Quit");
		while (true) {
			try {
				option = scanner.nextInt();
				if (option < 1 || option > 3) {
					System.out.println("Please input a valid option");
				}
				else break;
			} catch (InputMismatchException e) {
				System.out.println("Please input a valid option");
				scanner.next();
			}
		}
		
		if (option == 1) {
		
			int numPlayers = 0;
			System.out.println("Please specify the number of players (1-8): ");
			while (true) {
				try {
					numPlayers = scanner.nextInt();
					if (numPlayers < 1 || numPlayers > 8) {
						System.out.println("Please input a valid number of players");
					} else break;
				} catch (InputMismatchException e) {
					System.out.println("Please input a valid number of players");
					scanner.next();
				}
			}
			
			int gameVersion = 0;
			System.out.println("Which game version would you like?");
			System.out.println("1. Regular");
			System.out.println("2. Forsaken Lore Expansion");
			while (true) {
				try {
					gameVersion = scanner.nextInt();
					if (numPlayers < 1 || numPlayers > Expansion.values().length) {
						System.out.println("Please input a valid number");
					} else break;
				} catch (InputMismatchException e) {
					System.out.println("Please input a valid number");
					scanner.next();
				}
			}
			
			Expansion exp = Expansion.values()[gameVersion - 1];
			
			GameBoard.init(exp, AncientOne.AncientOneMap.get(1), numPlayers);
		}		
		else if (option == 2) {
			System.out.println("Please specify a directory path to the save file");
		}
		else {
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}

}
