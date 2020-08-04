package hackerRankPractice.thirtyDayChallenge.hangmanApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    String mysteryWord;
    StringBuilder currentGuess; // allows you to change characters inside String where you could not do ordinarily
    // Strings are immutable, cannot change "cat" into "cow" without creating a new String
    ArrayList<Character> previousGuesses = new ArrayList<>();

    // keep track of tries
    int maxTries = 6;
    int currentTry = 0;

    // set of variables that will deal with getting stuff from a file
    ArrayList<String> dictionary = new ArrayList<>(); // holds words
    private static FileReader fileReader; // helps us read things from file
    private static BufferedReader bufferedFileReader; // allows us to iterator through file and take things out of it

    public Hangman() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    public void initializeStreams() throws IOException {

        try {
            File inFile = new File("/dictionary.txt");
            fileReader = new FileReader(inFile); // reads file
            bufferedFileReader = new BufferedReader(fileReader); // allows parsing
            String currentLine = bufferedFileReader.readLine();
            while (currentLine != null) {
                dictionary.add(currentLine); // adding words to dictionary
                currentLine = bufferedFileReader.readLine(); // allows incrementing of current line
            }
            bufferedFileReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Could not initialize streams");
        }
    }

    public String pickWord() {
        Random random = new Random();
        int wordIndex = Math.abs(random.nextInt()) % dictionary.size();
        return dictionary.get(wordIndex);
    }

    // _ _ _ _ _ _ _
    public StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }
        return current;
    }

    // _ _ A _ _ B
    public String getFormalCurrentGuess() {
        return "Current Guess: " + currentGuess.toString(); // allows us to return current guess in String format
    }

//            " - - - - -\n"+
//            "|        |\n"+
//            "|        O\n" +
//            "|      / | \\ \n"+
//            "|        |\n" +
//            "|       / \\ \n" +
//            "|\n" +
//            "|\n";

    public boolean gameOver() {
        if (didWeWin()){
            System.out.println();
            System.out.println("Congrats! You won! You guessed the right word!");
        } else if (didWeLose()){
            System.out.println();
            System.out.println("Sorry, you lost. You spent all of your 6 tries. " +
                    "The word was " + mysteryWord + ".");
            return true;
        }
        return false;
    }

    private boolean didWeLose() {
        return currentTry >= maxTries;
    }

    private boolean didWeWin() {
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }

    private String getCondensedCurrentGuess() {
        String guess = currentGuess.toString();
        return guess.replace(" ","");
    }



    public boolean isGuessedAlready(char guess) {
        return previousGuesses.contains(guess);
    }

    public boolean playGuess(char guess) {
        boolean isItAGoodGuess = false;
        for (int i = 0; i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess) {
                currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
                previousGuesses.add(guess);
            }
        }
        if (!isItAGoodGuess) {
            currentTry++;
        }

        return isItAGoodGuess;
    }

    public String drawPicture() {
        switch (currentTry) {
            case 0:
                return noPersonDraw();
            case 1:
                return addHeadDraw();
            case 2:
                return addBodyDraw();
            case 3:
                return addOneArmDraw();
            case 4:
                return addSecondArmDraw();
            case 5:
                return addOneLegDraw();
            default:
                return fullPersonDraw();
        }
    }


    private String noPersonDraw() {
        return " - - - - -\n" +
                "|          \n" +
                "|          \n" +
                "|          \n" +
                "|          \n" +
                "|          \n" +
                "|\n" +
                "|\n";
    }

    private String addHeadDraw() {
        return " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|          \n" +
                "|          \n" +
                "|          \n" +
                "|\n" +
                "|\n";
    }

    private String addBodyDraw() {
        return " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|        |\n" +
                "|        |\n" +
                "|       \n" +
                "|\n" +
                "|\n";
    }

    private String addOneArmDraw() {
        return " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / |  \n" +
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }

    private String addSecondArmDraw() {
        return " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addOneLegDraw() {
        return " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|       /  \n" +
                "|\n" +
                "|\n";
    }

    private String fullPersonDraw() {
        return " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }
}
