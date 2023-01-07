package com.bridgelabz.day4_snake_and_ladder;

import java.util.Random;

public class WinPosition {

	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
		int position = 0;
        final int WINNINGPOSITION = 100;
        while (position <= WINNINGPOSITION) {
            Random rand = new Random();
            int diceValue = 1+rand.nextInt(6);
            System.out.println("Dice Value is  " + diceValue);
            int option = rand.nextInt(3);

            if (option == 0) {
                System.out.println("No Play");
            } else if (option == 1) {
                System.out.println("Ladder");
                position += diceValue;
                System.out.println("Current Position is " + position);
            } else if (option == 2) {
                System.out.println("Snake");
                position -= diceValue;
                System.out.println("Current Position is " + position);

                if (position < 0) {
                    position = 0;
                    System.out.println("Current Position is ==>" + position);
                }
            }
        }
	}

}
