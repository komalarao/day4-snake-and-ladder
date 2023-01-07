package com.bridgelabz.day4_snake_and_ladder;

import java.util.Random;

public class DiceCount {

	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
		 int position = 0;
	        int Dice_Roll_Count = 0;
	        final int Winning_Position = 100;
	        System.out.println("Initial Position " +position);
	        while(position <= Winning_Position) {
	            Random rand = new Random();
	            int Dice_Value = rand.nextInt(6)+1;
	            System.out.println("Dice Value is " +Dice_Value);
	            int option = rand.nextInt(3);
	            Dice_Roll_Count++;
	            if(position == Winning_Position) {
	                System.out.println("you won the game");

	                break;
	            }
	            switch(option) {
	                case 0:
	                    System.out.println("No Play");
	                    break;
	                case 1:
	                    System.out.println("Ladder");
	                    position += Dice_Value;
	                    System.out.println("Current Position is " + position);

	                    if(position > 100) {
	                        position = position - Dice_Value;
	                        System.out.println("Current Position is " + position);
	                    }
	                    break;
	                case 2:
	                    System.out.println("Snake");
	                    position -= Dice_Value;
	                    System.out.println("Current Position is " + position);

	                    if(position < 0) {
	                        position = 0;
	                        System.out.println("Current Position is " + position);
	                    }
	                    break;
	                default:
	                    System.out.println("Not Correct");
	            }
	            System.out.println("Dice Roll Count "+Dice_Roll_Count);

	        }
	}

}
