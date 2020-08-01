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
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile); // reads file
            bufferedFileReader = new BufferedReader(fileReader); // allows parsing
            String currentLine = bufferedFileReader.readLine();
            while (currentLine != null){
                dictionary.add(currentLine); // adding words to dictionary
            }
            bufferedFileReader.close();
            fileReader.close();
        } catch (IOException e){
            System.out.println("Could not initialize streams");
        }
    }
    public String pickWord(){
        Random random = new Random();
        int wordIndex = Math.abs(random.nextInt()) % dictionary.size();
        return dictionary.get(wordIndex);
    }

    // _ _ _ _ _ _ _
    public StringBuilder initializeCurrentGuess(){
        StringBuilder current = new StringBuilder();
        for (i)
    }
}
