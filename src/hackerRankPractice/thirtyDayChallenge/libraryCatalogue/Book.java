package hackerRankPractice.thirtyDayChallenge.libraryCatalogue;

public class Book {

    // properties/fields/global variables: what does a book have in it?
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether or not it is checked out
    int dayCheckedOut = -1;

    public Book() {
    }

    // constructor: what do I want in this book when I initialize it?
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    public Book(String title, int pageCount, int ISBN, boolean isCheckedOut, int dayCheckedOut) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.isCheckedOut = isCheckedOut;
        this.dayCheckedOut = dayCheckedOut;
    }

    // getters and setters
    // getters: instance methods
    // setters:

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    public void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
