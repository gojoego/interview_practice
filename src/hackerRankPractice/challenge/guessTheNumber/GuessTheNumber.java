package hackerRankPractice.challenge.guessTheNumber;

/*

class method: no instance needed to use this function

how big is #?
if (# > 0){
  print out # is big
}

how to play:    1. computer picks random number
                2. user guesses
                3. computer gives clues
                4. we guess until we get it

getters: get values of our properties

setters: set values of our properties



*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(11);
        howBigIsMyNumber(100);
        howBigIsMyNumber(5);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);

        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to my game. Try and guess my impossible number. It's between 0 and " +
                guessGame.max + " inclusive. Just type a number to get started.");
        guessGame.play();

    }

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random random = new Random();
        max = 100;
        theNUMBER = Math.abs(random.nextInt()) % (max + 1);
    }

    public void play(){
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT!");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x){
        if (x >= 0 && x <= 10){
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100){
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

}
