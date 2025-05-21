package Loops;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumbers {
    public static void runGuessingNumbers() {
        Scanner scann = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        boolean guessed = false;

        while (!guessed) {

            System.out.println("Wähle eine Zahl zwischen 1 und 100!");
            int guessedNumber = scann.nextInt();

            if ((guessedNumber >= 1) && (guessedNumber <= 100))
            {
                if (randomNumber == guessedNumber) {
                    System.out.println("Gewonnen!!!");
                    System.out.println("Richtig, die Nummer lautet: " + randomNumber);
                    guessed = true;
                } else if (randomNumber > guessedNumber) {
                    System.out.println("Die richtige Zahl ist größer als: " + guessedNumber);
                } else if (randomNumber < guessedNumber) {
                    System.out.println("Die richtige Zahl ist kleiner als: " + guessedNumber);
                }
            }
            else{
                System.out.println("Falsche Angabe! Wähle eine Zahl zwischen 1 und 100!");
            }

        }

    }
}
