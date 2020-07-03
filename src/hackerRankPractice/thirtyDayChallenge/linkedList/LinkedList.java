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

CHALLENGE
Objective
Today we're working with Linked Lists. Check out the Tutorial tab for learning materials and an instructional video!

A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

A Node insert function is also declared in your editor. It has two parameters: a pointer, , pointing to the first node of a linked list, and an integer  value that must be added to the end of the list as a new Node object.

Task
Complete the insert function in your editor so that it creates a new Node (pass  as the Node constructor argument) and inserts it at the tail of the linked list referenced by the  parameter. Once the new node is added, return the reference to the  node.

Note: If the  argument passed to the insert function is null, then the initial list is empty.

Input Format

The insert function has  parameters: a pointer to a Node named , and an integer value, .
The constructor for Node has  parameter: an integer value for the  field.

You do not need to read anything from stdin.

Output Format

Your insert function should return a reference to the  node of the linked list.

Sample Input

The following input is handled for you by the locked code in the editor:
The first line contains T, the number of test cases.
The  subsequent lines of test cases each contain an integer to be inserted at the list's tail.

4
2
3
4
1
Sample Output

The locked code in your editor prints the ordered data values for each element in your list as a single line of space-separated integers:

2 3 4 1
Explanation

, so the locked code in the editor will be inserting  nodes.
The list is initially empty, so  is null; accounting for this, our code returns a new node containing the data value  as the  of our list. We then create and insert nodes , , and  at the tail of our list. The resulting list returned by the last call to  is , so the printed output is 2 3 4 1.

*/

public class LinkedList {

    // properties
    Node head;
    int count;

    // constructors

//    public LinkedList(){
//        head = null;
//        count = 0;
//    }

    public LinkedList(Node newHead){
        head = newHead;
        count = 1;
    }

    // methods

    // add
    public void add(int newData){
        // first create new node with data
        Node temp = new Node(newData);
        // set reference to last node
        Node current = head;
        // while loop to iterate through list
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index){
        if (index <= 0){
            return -1; // better to throw an exception, should equal null
        }
        Node current = head;
        for (int i = 1; i < index; i++){
            
        }
    }

    // size

    // isEmpty

    // remove

    public static void main(String[] args) {

    }
}

/*

Linked List
A singly linked list is a data structure having a list of elements where each element has a reference pointing to the next element in the list. Its elements are generally referred to as nodes; each node has a data field containing a data value and a next field pointing to the next element in the list (or null if it is the last element in the list). The diagram below depicts a linked list of length :

myLinkedList.png

The sample code below demonstrates how to create a LinkedList of Strings, and some of the operations that can be performed on it.

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
