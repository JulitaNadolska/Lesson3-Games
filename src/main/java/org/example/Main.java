package org.example;
import java.util.*;

public class Main {
    public static class TableGame {
        public static void main(String[] args) {
            printMessage("Welcome to the Table Game!");
            printMessage("Enter, how many number you want to have in your table: ");
            Scanner s = new Scanner(System.in);
            int tableSize = s.nextInt();
            int myTable[] = new int [tableSize];

            printMessage("Now it's time to enter the numbers: ");

            for(int i = 0; i<tableSize; i++) {
                myTable[i] = s.nextInt();
            }

            int tableLength = myTable.length;
            int max = myTable[0];

            for (int i=0; i<tableLength; i++) {
                if (myTable[i] > max)
                    max=myTable[i];
            }

            int total = 0;

            for (int i = 0; i <= 2 ; i++) {
                total += myTable[i];
            }
            printMessage("The maximum value from the table is: " + max);

            int averageValue = total / tableLength;

            printMessage("Average from the numbers is: " + averageValue);

        }
    }

    //------------------------------------------------------------------------------------------
    public static class GuessingGame {
        public static void main(String[] args) {
            int numberToGuess = new Random().nextInt(100);
            Scanner scanner = new Scanner(System.in);

            int tryOut = 5;
            int i, guess;

            printMessage("Welcome to the Big Guessing Game");
            printMessage("Remember you have only " + tryOut + " try out(s)!");
            System.out.print("Enter the number: ");

            for(i=0; i < tryOut; i++)

            {
                guess = scanner.nextInt();
                if (numberToGuess == guess) {
                    printMessage("Super! This is the number.");
                    break;
                } else if (numberToGuess < guess && i != tryOut - 1) {
                    printMessage("Entered number is GREATER than the one you are trying to guess. Try again!");
                } else if (numberToGuess > guess && i != tryOut - 1) {
                    printMessage("Entered number is LOWER than the one you are trying to guess. Try again!");
                }
            }
            if(i == tryOut)

            {
                printMessage("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                printMessage("Game over");
            }
        }
    }

// private methods
    private static void printMessage(String x) {
        System.out.println(x);
    }
}
