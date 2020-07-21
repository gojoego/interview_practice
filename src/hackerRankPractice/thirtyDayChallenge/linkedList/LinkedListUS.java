package hackerRankPractice.thirtyDayChallenge.linkedList;

/*

data structures
-arrays

    get object at index: variableName[index]

    change object at index:
    1. variableName[index] = newObject
    2. once change, original is gone

-dictionaries/hashmaps

    key/value pairs

-containers that hold data

LINKED LIST

-data structure that consists of group of nodes which represent sequence together

    1. order matters
    2. space is dynamic

-each node composed of data
-reference or link to next node in sequence

what do we need?
-ability to add notes
-ability to remove nodes
-how many nodes in this sequence?
-is the sequence empty?
-retrieve nodes(data in nodes)

DOUBLY LINKED LISTS
-iterate forwards via getNext
-iterate backwards via getPrev

ABSTRACTION: do not know how it works but can still use it

CHALLENGE

A Node class is provided for you in the editor. A Node object has an integer data field, data,
and a Node instance pointer, next, pointing to another node (i.e.: the next node in a list).

A Node insert function is also declared in your editor. It has two parameters: a pointer, head,
pointing to the first node of a linked list, and an integer data value that must be added to
the end of the list as a new Node object.

Task
Complete the insert function in your editor so that it creates a new Node
(pass data as the Node constructor argument) and inserts it at the tail of the
linked list referenced by the head parameter. Once the new node is added,
return the reference to the data node.

Note: If the head argument passed to the insert function is null, then the initial list is empty.

Input Format

The insert function has 2 parameters: a pointer to a Node named head, and an integer value, data.
The constructor for Node has 1 parameter: an integer value for the data field.

You do not need to read anything from stdin.

Output Format

Your insert function should return a reference to the head node of the linked list.

Sample Input

The following input is handled for you by the locked code in the editor:
The first line contains T, the number of test cases.
The T subsequent lines of test cases each contain an integer to be inserted at the list's tail.

4
2
3
4
1

Sample Output

The locked code in your editor prints the ordered data values for each element in
your list as a single line of space-separated integers:

2 3 4 1

Explanation

T = 4, so the locked code in the editor will be inserting 4 nodes.
The list is initially empty, so head is null; accounting for this,
our code returns a new node containing the data value 2 as the head
of our list. We then create and insert nodes 3, 4, and 1 at the tail
of our list. The resulting list returned by the last call to insert
is [2,3,4,1], so the printed output is 2 3 4 1.

*/

import java.util.LinkedList;
import java.util.Scanner;

class Node<D> {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class LinkedListUS<D> {

    // properties
    Node1<D> head;
    int count;

    // constructors

//    public LinkedList(){
//        head = null;
//        count = 0;
//    }

    public LinkedListUS(Node1<D> newHead){
        head = newHead;
        count = 1;
    }

    // methods

    // add
    public void add(D newData){
        // first create new node with data
        Node1<D> temp = new Node1(newData);
        // set reference to last node
        Node1<D> current = head;
        // while loop to iterate through list
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public D get(int index){
//        if (index <= 0){
//            return -1; // better to throw an exception, should equal null
//        }
        Node1<D> current = head;
        // starting at 1 because starting count at 1
        for (int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size(){
        return count;
    }

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // remove
    public void move(){
        // remove from back of list
        Node1<D> current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);

        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    public static Node insert(Node head, int data){

        if (head == null){
            return new Node(data);
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;

    }

    public static void display(Node head){
        Node start = head;
        while (start != null){
            System.out.println(start.data + " ");
            start = start.next;
        }
    }
}

/*

LINKED LIST
A singly linked list is a data structure having a list of elements where each element
has a reference pointing to the next element in the list. Its elements are generally
referred to as NODES; each node has a data field containing a data value and a next
field pointing to the next element in the list (or null if it is the last element in the list).

The sample code below demonstrates how to create a LinkedList of Strings, \
and some of the operations that can be performed on it.

LinkedList<String> myLinkedList = new LinkedList<String>();

// Add a node with data="First" to back of the (empty) list
myLinkedList.add("First");

// Add a node with data="Second" to the back of the list
myLinkedList.add("Second");

// Insert a node with data="Third" at front of the list
myLinkedList.addFirst("Third");

// Insert a node with data="Fourth" at back of the list
myLinkedList.addLast("Fourth");

// Insert a node with data="Fifth" at index 2
myLinkedList.add(2, "Fifth");

// Print the list: [Third, First, Fifth, Second, Fourth]
System.out.println(myLinkedList);

// Print the value at list index 2:
System.out.println(myLinkedList.get(2));

// Empty the list
myLinkedList.clear();

// Print the newly emptied list: []
System.out.println(myLinkedList);

// Adds a node with data="Sixth" to back of the (empty) list
myLinkedList.add("Sixth");
System.out.println(myLinkedList); // print the list: [Sixth]
The above code produces the following output:

[Third, First, Fifth, Second, Fourth]
Fifth
[]
[Sixth]

*/
