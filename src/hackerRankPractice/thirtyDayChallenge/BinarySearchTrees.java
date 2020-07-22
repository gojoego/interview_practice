package hackerRankPractice.thirtyDayChallenge;

/*

Task
The height of a binary search tree is the number of edges between the tree's root and its furthest leaf.
You are given a pointer, root, pointing to the root of a binary search tree. Complete the getHeight function
provided in your editor so that it returns the height of the binary search tree.

Input Format
The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
The first line contains an integer, n, denoting the number of nodes in the tree.
Each of the n subsequent lines contains an integer, data, denoting the value of an element that must be added
to the BST.

Output Format

The locked stub code in your editor will print the integer returned by your
getHeight function denoting the height of the BST.

Sample Input

7
3
5
2
1
4
6
7

Sample Output

3

*/

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTrees {

//    public static int getHeight(Node root){
//        //Write your code here
//        int leftCount = 0;
//        int rightCount = 0;
//        if (root == null){
//            return 0;
//        } else {
//            if (root.left != null){
//                leftCount = getHeight(root.left) + 1;
//            }
//            if (root.right != null){
//                rightCount = getHeight(root.right) + 1;
//            }
//            return Math.max(leftCount, rightCount);
//        }
//    }

    public static int getHeight(Node root) {
        //Write your code here
        int leftCount = 0;
        int rightCount = 0;
        if (root.left != null) {
            leftCount = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            rightCount = getHeight(root.right) + 1;
        }
        return (leftCount > rightCount ? leftCount : rightCount);

    }

    /*

    RECURSION

    int fact(int n)
    {
        if (n < = 1) // base case
            return 1;
        else
            return n*fact(n-1);
    }

    */

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}

/*

BINARY TREE

-fundamentally, a binary tree is composed of nodes connected by edges
(with further restrictions discussed below)
-some binary tree, t, is either empty or consists of a single root element
with two distinct binary tree child elements known as the left subtree and the right subtree of t
-as the name binary suggests, a node in a binary tree has a maximum of 2 children

here are the basic facts and terms to know about binary trees:

1. convention for binary tree diagrams is that the root is at the top,
    and the subtrees branch down from it
2. node's left and right subtrees are referred to as children,
    and that node can be referred to as the parent of those subtrees
3. non-root node with no children is called a leaf
4. some node a is an ancestor of some node b if b is located in a left
    or right subtree whose root node is a -> this means that the root
    node of binary tree t is the ancestor of all other nodes in the tree
5. if some node a is an ancestor of some node b, then the path from a to b
    is the sequence of nodes starting with a, moving down the ancestral
    chain of children, and ending with b
6. the depth (or level) of some node a is its distance (i.e., number of edges)
    from the tree's root node
7. simply put, the height of a tree is the number of edges between the root
    node and its furthest leaf
    -> more technically put, it's 1 + max(height(leftSubtree), height(rightSubtree))
    (i.e., one more than the maximum of the heights of its left and right subtrees)
    -> any node has a height of 1, and the height of an empty subtree is -1
    -> because the height of each node is 1 + the maximum height of its subtrees
    and an empty subtree's height is -1, the height of a single-element tree or leaf node is 0

BINARY SEARCH TREE
Binary Search Tree (BST), t, is a binary tree that is either empty or satisfies the following three conditions:
1. Each element in the left subtree of t is less than or equal to the root element of t
    (i.e., max(leftTree(t).value) <= t.value)
2. Each element in the right subtree of t is greater than the root element of t
    (i.e., min(rightTree(t).value) > t.value)
3. Both leftTree(t) and rightTree(t) are BSTs

-you can essentially think of it as a regular binary tree where for each node parent having a
leftChild and rightChild, leftChild.value <= parent.value < rightChild.value

*/


























