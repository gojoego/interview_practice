/*

    Challenge #2: Write a function that takes two words as an argument and returns true if they
    are anagrams (contain the exact same letters) and false otherwise.

    for example:

    boolean isAnagramTrue = checkIfIsAnagram("cinema", "iceman"); // returns true
    boolean isAnagramFalse = checkIfIsAnagram("cinemo", "iceman"); // returns false

*/

import java.util.Arrays;

// JAVA program to check whether two strings
// are anagrams of each other
public class AnagramSpotter1 {

    public static void main(String[] args) {

        anagramOrNot("cinema".toCharArray(), "iceman".toCharArray());

    }

    // function to check whether two strings anagrams
    static boolean anagramOrNot(char[] one, char[] two) {

        // get length of both strings and return false if not equal
        // if they number of letters not same != anagram
        int oneLength = one.length;
        int twoLength = two.length;

        if (oneLength != twoLength) {
            return false;
        }

        Arrays.sort(one);
        Arrays.sort(two);

        for (int i = 0; i < oneLength; i++) {
            if (one[i] != two[i]) {
                return false;
            }
        }
        return true;
    }
}
