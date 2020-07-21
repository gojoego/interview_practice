package hackerRankPractice.thirtyDayChallenge.linkedList;

// node holds data and reference to next node

// define node
public class Node1<D> {

    // properties
    Node1<D> next;
    D data;

    // methods

    // constructors
    public Node1(D newData){
        data = newData;
        next = null;
    }

    public Node1(D newData, Node1 newNext){
        data = newData;
        next = newNext;
    }

    // getters and setters

    public Node1<D> getNext() {
        return next;
    }

    public void setNext(Node1<D> newNode1) {
        this.next = next;
    }

    public D getData() {
        return data;
    }

    public void setData(D newData) {
        data = newData;
    }
}
