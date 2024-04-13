package com.coderscampus.assignment2;

import java.util.*;


public class Assignment2App {
    public static void main(String[] args) {

        Random randomNum = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("You have five chances to guess the correct number, Good Luck!");

        int randomGen = randomNum.nextInt(101);
        System.out.print("Pick a number between 1 and 100: ");
//        System.out.println(randomGen);

        for (int i = 0; i < 5; i++) {

            int playerGuess = Integer.parseInt(scanner.nextLine());

            while (playerGuess < 1 || playerGuess > 100) {
                System.out.print("Your guess is not between 1 and 100, please try again: ");
                playerGuess = Integer.parseInt(scanner.nextLine());
            }

            if (playerGuess < randomGen) {
                System.out.print("Please pick a higher number: ");
            } else if (playerGuess > randomGen) {
                System.out.print("Please pick a lower number: ");

            } else {
                System.out.println("You win! Congratulations! d^___^b");
                break;
            }

            if (i == 4 && playerGuess != randomGen) {
                System.out.println("\nYou lose!");
                System.out.println("the number to guess was: " + randomGen);
            }


        }
    }
}
