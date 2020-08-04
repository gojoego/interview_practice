package hackerRankPractice.thirtyDayChallenge;

/*

Task
A Node class is provided for you in the editor. A Node object has an integer data field, data,
and a Node instance pointer, next, pointing to another node (i.e.: the next node in a list).
A removeDuplicates function is declared in your editor, which takes a pointer to the head node of
a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes
from the list and returns the head of the updated list.

Note:   The head pointer may be null, indicating that the list is empty.
        Be sure to reset your next pointer when performing deletions to avoid breaking the list.

Input Format

You do not need to read any input from stdin. The following input is handled by the locked stub
code and passed to the removeDuplicates function:

The first line contains an integer, N, the number of nodes to be inserted.
The N subsequent lines each contain an integer describing the data value of a node being inserted at the list's tail.

Constraints:    The data elements of the linked list argument will always be in non-decreasing order.

Sample Input

6
1
2
2
3
3
4

Sample Output

1 2 3 4

Explanation

N = 6, and our non-decreasing list is {1, 2, 2, 3, 3, 4}. The values 2 and 3 both occur twice in the list,
so we remove the two duplicate nodes. We then return our updated (ascending) list, which is {1, 2, 3, 4}.

*/

import java.util.LinkedList;
import java.util.Scanner;

class Node2 {
    int data;
    Node2 next;

    Node2(int d) {
        data = d;
        next = null;
    }
}

public class MoreLinkedLists {

    public static Node2 removeDuplicates(Node2 head) {
        LinkedList list = new LinkedList();
        // write your code here
        // utilize linkedlist
        // if current == next then remove
        // for loop to iterate over nodes
        // how do we get to 
    }

    public static Node2 insert(Node2 head, int data) {
        Node2 p = new Node2(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node2 start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;
        }
        return head;
    }

    public static void display(Node2 head) {
        Node2 start = head;
        while (start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node2 head = null;
        int T = scanner.nextInt();
        while (T --> 0){
            int element = scanner.nextInt();
            head = insert(head, element);
        }
        head = removeDuplicates(head);
        display(head);
    }
}

/*

GARBAGE COLLECTION
-form of automated memory management that frees up memory locations that are no longer in use
-when program reserves block of memory (like for storing variables), marks "in-use" and returns
    reference to it which is managed by your variable
-if program poorly written, reference to that block of memory may be lost or broken
-once reference to that location is lost, program can neither access data stored there nor can
    it store new data there (because memory was not released back to program prior to
    breaking reference)
-Java has automatic garbage collection -> no need to worry about releasing (or de-allocating)
    blocks of memory you no longer need because Java garbage collector does it for you
-if you are writing in language that does not have garbage collection, you should make sure
    you are freeing up the memory that a reference refers to before deleting the reference
    itself

DELETING NODES FROM LINKED LISTS
-removing an element from a linked list of nodes is easier than it sounds
-in a language with automatic garbage collection like Java, you simply have to change the next
    reference from one node so that it points to another node


*/