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
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    public void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
