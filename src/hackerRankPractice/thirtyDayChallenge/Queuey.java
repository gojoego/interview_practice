package hackerRankPractice.thirtyDayChallenge;

/*

data structures:
    containers (hold many objects)
    -arrays
    -dictionaries
    -linked lists
    queues
    stacks

queues:
    behavior: FIFO
    -first in, first out
    -enqueue: adding items to queue
    -dequeue: removing items from queue
        -must dequeue first element that came in before anything else

what is in a queue?
-queue class with linked list as property
-is empty
-size
-enqueue
-dequeue
-peek

*/

import java.util.LinkedList;

public class Queuey {

    // creating a linked list
    LinkedList queue;

    // making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }

    // is our queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // what is the size of our queue?
    public int size(){
        return queue.size();
    }

    // enqueueing an item
    public void enqueue(String n){
        queue.addLast(n);
    }

    // de-queueing an item
    public String dequeue(){
        // must cast to int because method originally takes in object
        return (String) queue.remove();
    }

    // peek at the first item
    public String peek(){
        return (String) queue.get(0);
    }

    public static void main(String[] args) {

//        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("First out: " + numberQueue.dequeue());
//        System.out.println("Peek at second item: " + numberQueue.peek());
//        System.out.println("Second out: " + numberQueue.dequeue());
//        System.out.println("Third out: " + numberQueue.dequeue());

        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.print(stringQueue.dequeue() + ".");
    }
}

/*


*/















