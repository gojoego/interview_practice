package hackerRankPractice.thirtyDayChallenge;

/*

mad libs:
1. a story with blanks
2. you fill in the blanks without knowing the big picture
3. we get a funny story

*/

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        MadLibs game = new MadLibs();
        game.printInstructions();

    }

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String adjective3;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNumbers;
    Random random = new Random();

    // print instructions to player
    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in words, " +
                "we'll give you a story. Start by typing in a name.");
    }

    // get data from player
    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun.");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun.");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me the last noun.");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("I need an adjective.");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("I really need an alpaca... just kidding, give me an adjective.");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("PLEASE: I really want an adverb.");
        setAdverb(scanner.nextLine());
    }


    public void putTogetherTheStory() {
        String story = "Jesse and her best friend " + getName() + " went to Disney World today! " +
                "They saw a " + getNoun1() + " in a show at the Magic Kingdom " +
                "and ate a " + getAdjective1() + " feast for dinner. The next day I " +
                "ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + "" +
                "and then that night I gazed at the " + getRandomNumbers() + " " +
                getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdverb();
        enterNoun2();
        enterAdjective2();
        enterNoun3();
    }

    // getters and setters

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public String getAdjective3() {
        return adjective3;
    }

    public void setAdjective3(String adjective3) {
        this.adjective3 = adjective3;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(String randomNumbers) {
        int number = Math.abs(random.nextInt()) % 100;
        int index = 0;
        // creating an array
        // rule for arrays: each index must hold the same data type for a given instance (person, int, etc)
        int[] numberHolder = new int[3];
        while (index < numberHolder.length){
            numberHolder[index] = number + index;
            index++;
        }
        randomNumbers = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }
}
