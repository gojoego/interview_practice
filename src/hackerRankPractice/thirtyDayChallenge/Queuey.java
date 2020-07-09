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
import java.util.Queue;
import java.util.Stack;

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

//        Queuey stringQueue = new Queuey();
//        stringQueue.enqueue("hi");
//        stringQueue.enqueue("there");
//        System.out.print(stringQueue.dequeue() + " ");
//        System.out.print(stringQueue.dequeue() + ".");

        // when working with data structures, will want one data type
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop() + " ");
        System.out.println("Peek: " + stacky.peek());
        System.out.println(stacky.pop() + "! ");
        System.out.println("Size: " + stacky.size());

    }
}

/*

stacks:
    behavior: LIFO
    -last in, first out
    -push: adding things to stack
    -pop: removing from stack
    -can you implement with linked list?
    -already built into Java

traversing data structures
-only way to traverse stack or queue is to pop/dequeue
    --> which means we remove everything in given stack or queue
-that means data is gone unless we save i  in variable
-NOTE: not case for linked lists

we limit capabilities..
-of linked lists so that it can act like queue or stack
    --> with appropriate behavior

documentation
-what is a method called?
-what does a method do?
-what does this method return?
-how can I use this method in my program?
-does this method have any side-effects?
-what is properties does a class have?

Stack Overflow
-problems with answers from other programmers

*/















