package hackerRankPractice.thirtyDayChallenge;

/*



*/

public class LevelOrderTraversal {
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















