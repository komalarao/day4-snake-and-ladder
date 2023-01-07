package com.bridgelabz.day4_snake_and_ladder;

import java.util.Random;

public class DiceValue {

	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
		Random rand = new Random();
        int Dice_Value = 1+rand.nextInt(6);
        System.out.println("Dice Value is " +Dice_Value);
	}

}
