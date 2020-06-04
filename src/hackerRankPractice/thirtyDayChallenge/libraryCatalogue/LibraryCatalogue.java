package hackerRankPractice.thirtyDayChallenge.libraryCatalogue;

/*

What's in a catalog?

1. what's available?
2. check in a book
3. check out a book
4. container for books
5. is a given book returned late?
6. is a book checked out?

Library Properties

1. book collection
2. current day
3. length of check out period
4. initial late fee
5. per day late fee

*/

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    // properties/fields/global variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    // constructors
    public LibraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // getters and setters
    
    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public void setLengthOfCheckoutPeriod(int lengthOfCheckoutPeriod) {
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }

    public static void main(String[] args) {

    }
}

/*

library catalogue class

1. how long can we check out?
2. what's in a library?
3. more!

book class

1. title
2. ISBN number
3. page count
4. what defines a book

*/