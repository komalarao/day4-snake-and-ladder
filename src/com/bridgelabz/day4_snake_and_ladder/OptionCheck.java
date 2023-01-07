package com.bridgelabz.day4_snake_and_ladder;

import java.util.Random;

public class OptionCheck {

	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
		int position = 0;
        Random rand = new Random();
        int Dice_Value = 1+rand.nextInt(6);
        System.out.println("Dice Value is " + Dice_Value);
        int option = rand.nextInt(3);
        if (option == 0) {
            System.out.println("No Play");
        } else if (option == 1) {
            System.out.println("Ladder");
            position += Dice_Value;
            System.out.println("Current Position is " + position);
        } else {
            System.out.println("Snake");
            position -= Dice_Value;
            System.out.println("Current Position is " + position);
        }
	}

}
