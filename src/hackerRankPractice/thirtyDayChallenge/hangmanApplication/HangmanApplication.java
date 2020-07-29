package hackerRankPractice.thirtyDayChallenge.hangmanApplication;

/*

hangman
-implement entire game
-read from files
-input/output from user

so what are we doing?
-hangman class: represents logic of game
-hangman application class: where we actually make and run hangman games

*/

import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it character " +
                "by character. If you guess wrong 6 times, then I win. If you can guess it before then, you win. " +
                "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below " +
                "that is your current guess, which starts off as nothing. Every time you " +
                "guess incorrectly. I add a body part to the picture. When there is a full" +
                " person, you lose.");
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay){

            System.out.println();
            System.out.println();
        }
    }
}
