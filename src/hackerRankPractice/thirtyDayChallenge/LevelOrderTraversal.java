package hackerRankPractice.thirtyDayChallenge;

/*

Task
A level-order traversal, also known as a breadth-first search, visits each level of a
tree's nodes from left to right, top to bottom. You are given a pointer, root, pointing to
the root of a binary search tree. Complete the levelOrder function provided in your editor
so that it prints the level-order traversal of the binary search tree.

Hint: You'll find a queue helpful in completing this challenge.

Input Format

The locked stub code in your editor reads the following inputs and assembles them into a BST:
The first line contains an integer, T (the number of test cases).
The T subsequent lines each contain an integer, data, denoting the value of an element that must be added to the BST.

Output Format

Print the data value of each node in the tree's level-order traversal as a single line of N space-separated integers.

Sample Input

6
3
5
4
7
2
1

Sample Output

3 2 5 1 4 7

*/

import java.util.Scanner;

class Node1 {

    Node1 left, right;
    int data;
    Node1(int data){
        this.data = data;
        left = right = null;
    }

}

public class LevelOrderTraversal {

    static void levelOrder(Node1 root){
        //Write your code here
        if (root != null){

        }

//        levelOrder(BinaryTree t) {
//            if(t is not empty) {
//                // enqueue current root
//                queue.enqueue(t)
//
//                // while there are nodes to process
//                while( queue is not empty ) {
//                    // dequeue next node
//                    BinaryTree tree = queue.dequeue();
//
//                    process tree's root;
//
//                    // enqueue child elements from next level in order
//                    if( tree has non-empty left subtree ) {
//                        queue.enqueue( left subtree of t )
//                    }
//                    if( tree has non-empty right subtree ) {
//                        queue.enqueue( right subtree of t )
//                    }
//                }
//            }
//        }

    }

    public static Node1 insert(Node1 root, int data){
        if (root == null){
            return new Node1(data);
        }
        else {
            Node1 current;
            if (data <= root.data){
                current = insert(root.left, data);
                root.left = current;
            }
            else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Node1 root = null;
        while (T --> 0){
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}

/*

TREE TRAVERSAL
A traversal of some binary tree, t, is an algorithm that iterates through each node in t exactly 1 time

INORDER TRAVERSAL
-inorder traversal of tree t is a recursive algorithm that follows the left subtree
-once there are no more left subtrees to process, we process the right subtree
-elements are processed in left-root-right order
-basic algorithm is as follows:

inOrder(t) {
    if(t is not empty) {
        inOrder( left subtree of t )
        process t's root element
        inOrder( right subtree of t )
    }
}

-inorder traversal of a binary search tree will process the tree's elements in ascending order

POSTORDER TRAVERSAL
-preorder traversal of tree t is a recursive algorithm that processes the root and then performs
preorder traversals of the left and right subtrees
-elements are processed root-left-right order
-basic algorithm is as follows:

preOrder(t) {
    if(t is not empty) {
        process t's root element
        preOrder( left subtree of t )
        preOrder( right subtree of t )
    }
}

-because a preorder traversal goes as deeply to the left as possible,
it's also known as a depth-first-search or DFS

LEVEL-ORDER TRAVERSAL (BFS)
-level-order traversal of tree t is a recursive algorithm that processes the root,
followed by the children of the root (from left to right), followed by the grandchildren
of the root (from left to right), etc
-basic algorithm shown below uses a queue of references to binary trees to keep track of the subtrees at each level:

levelOrder(BinaryTree t) {
    if(t is not empty) {
        // enqueue current root
        queue.enqueue(t)

        // while there are nodes to process
        while( queue is not empty ) {
            // dequeue next node
            BinaryTree tree = queue.dequeue();

            process tree's root;

            // enqueue child elements from next level in order
            if( tree has non-empty left subtree ) {
                queue.enqueue( left subtree of t )
            }
            if( tree has non-empty right subtree ) {
                queue.enqueue( right subtree of t )
            }
        }
    }
}

-because a level-order traversal goes level-by-level, it's also known as a breadth-first-search (BFS)

*/















