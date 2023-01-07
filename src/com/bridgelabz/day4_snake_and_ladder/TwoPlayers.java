package com.bridgelabz.day4_snake_and_ladder;

import java.util.Random;

public class TwoPlayers {

	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
		int position_player1 = 0;
        int position_player2 = 0;
        int counter_P1 = 0;
        int counter_P2 = 0;
        final int WINNING_POSITION = 100;

        //using while loop
        while(position_player1 <= WINNING_POSITION  || position_player2 <= WINNING_POSITION) {
            Random rand = new Random();
            int Dice_Value1 = rand.nextInt(6)+1;
            System.out.println("PLAYER1 --> ");
            System.out.println("Dice Value is ==> " +Dice_Value1);
            int option = rand.nextInt(3);

            //check condition in switch
            counter_P1++;
            if(position_player1 == WINNING_POSITION) {
                System.out.println("<==============>Player 1 Won The Game<===============>");
                break;
            }
            switch(option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    position_player1 += Dice_Value1;
                    System.out.println("Current Position is ==>" + position_player1);

                    if(position_player1 > 100) {
                        position_player1 = position_player1 - Dice_Value1;
                        System.out.println("Current Position is ==>" + position_player1);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    position_player1 -= Dice_Value1;
                    System.out.println("Current Position is ==>" + position_player1);

                    if(position_player1 < 0) {
                        position_player1 = 0;
                        System.out.println("Current Position is ==>" + position_player1);
                    }
                    break;
                default:
                    System.out.println("Not Correct");
            }
            System.out.println("Dice Roll Count for Player1 ===>"+counter_P1);
            System.out.println("-----------------------------------------------------");

            //player2

            int Dice_Value2 = rand.nextInt(6)+1;
            System.out.println("PLAYER2 --> ");
            System.out.println("Dice Value is ==> " +Dice_Value2);
            int option2 = rand.nextInt(3);
            counter_P2++;
            if(position_player2 == WINNING_POSITION){
                System.out.println("<==============>Player 2 Won The Game<===============>");
                break;
            }
            switch(option2) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    position_player2 += Dice_Value2;
                    System.out.println("Current Position is ==>" + position_player2);

                    if(position_player2 > 100) {
                        position_player2 = position_player2 - Dice_Value2;
                        System.out.println("Current Position is ==>" + position_player2);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    position_player2 -= Dice_Value2;
                    System.out.println("Current Position is ==>" + position_player2);

                    if(position_player2 < 0) {
                        position_player2 = 0;
                        System.out.println("Current Position is ==>" + position_player2);
                    }
                    break;
                default:
                    System.out.println("Not Correct");

            }
            System.out.println("Dice Roll Count for Player2 ===>"+counter_P2);
            System.out.println("-------------------------------------------------");

        }

        if(position_player1==WINNING_POSITION)
            System.out.println("***Player 1 Won The Game***");
        else
            System.out.println("***Player 2 Won The Game***");
	}

}
