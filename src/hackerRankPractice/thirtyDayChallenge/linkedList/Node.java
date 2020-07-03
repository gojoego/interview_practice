package hackerRankPractice.thirtyDayChallenge.linkedList;

// node holds data and reference to next node

// define node
public class Node {

    // properties
    Node next;
    int data;

    // methods

    // constructors
    public Node(int newData){
        data = newData;
        next = null;
    }

    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }

    // getters and setters

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        data = newData;
    }
}
