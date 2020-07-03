package hackerRankPractice.thirtyDayChallenge.linkedList;

// node holds data and reference to next node

// define node
public class Node1 {

    // properties
    Node1 next;
    int data;

    // methods

    // constructors
    public Node1(int newData){
        data = newData;
        next = null;
    }

    public Node1(int newData, Node1 newNext){
        data = newData;
        next = newNext;
    }

    // getters and setters

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 newNode1) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        data = newData;
    }
}
