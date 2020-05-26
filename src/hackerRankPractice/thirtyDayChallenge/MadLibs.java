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

    }

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String adjective3;
    String adverb;
    String randomNumbers;
    Random random = new Random();

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
        this.randomNumbers = randomNumbers;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }


}
