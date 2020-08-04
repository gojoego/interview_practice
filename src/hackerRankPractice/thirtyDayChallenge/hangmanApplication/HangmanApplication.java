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

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        // how do we play the game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it character " +
                "by character. \n If you guess wrong 6 times, then I win. \n If you can guess it before then, you win. " +
                "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below " +
                "that is your current guess, which starts off as nothing. \n Every time you " +
                "guess incorrectly. I add a body part to the picture. \n When there is a full" +
                " person, you lose.");

        // allows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay){
            // setting up the game
            System.out.println();
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();

            do {
                // draw the things...
                System.out.println("");
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();

                // get the guess
                System.out.println("Enter a character that you think is in the word.");
                char guess = (scanner.next().toLowerCase()).charAt(0);
                System.out.println();

                // check if the character is guessed already
                if (game.isGuessedAlready(guess)){
                    System.out.println("Try again! You've already guessed that character.");
                    guess = (scanner.next().toLowerCase()).charAt(0);
                }

                // play the guess
                if (game.playGuess(guess)){
                    System.out.println("Great guess! That character is in the word!");
                }else {
                    System.out.println("Unfortunately that character isn't int he word");
                }
            }
            while (!game.gameOver());
                // playing the game

                // playing again or no?
                System.out.println();
                System.out.println("Do you want to play another game? Enter Y if you do.");
                Character response = (scanner.next().toUpperCase()).charAt(0);
                doYouWantToPlay = (response == 'Y');

        }
    }
}










