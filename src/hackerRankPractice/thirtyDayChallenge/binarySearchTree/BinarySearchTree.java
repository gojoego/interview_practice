package hackerRankPractice.thirtyDayChallenge.binarySearchTree;

/*

more data structures: graphs and trees
-more terms
-recursive

when we draw tree, we draw a root
-node
-element of tree

trees
-root
    has two children
-leaves or children
-can add children to children
-the children are trees, sub-trees

1. node as child
2. subtree as child
3. no child

there are different ways of organizing data with a tree
what makes something a child vs a parent

heap
-root has special relations with children
-but children have no relationship with each other
-tree/heap idea can be implemented as an array

1. min-heap:
    -smaller data
    -smallest element at root
    -everything below is bigger than root
    -root is smaller than children
    -does not mean 1 child smaller than other
    -order does not matter
    -as long as they are smaller than parent
    -example: golf

2. max-heap:
    =opposite of min heap
    -largest element at root
    -root is largest element
    -multiple representations of data as long as max-heap property reserved
    -get child
        parent * 2
        parent * 2 + 1
    -get parent
        child/2

binary search trees (bst)
-relationships between children matter
-tree where root is middle node
-left child is less
-right child greater
-recursive structure
-can be implemented as arrays
-get parent: child/2 = parent
-left child: parent * 2
-right child: parent * 2 + 1

what are we making?

-a tree interface implemented by:
    1. nonemptybst -> class representing non-empty binary search trees
    2. emptybst -> class representing empty binary search trees

*/

public class BinarySearchTree {

    public static void main(String[] args) throws Exception {

        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);

    }
}

/*



*/









