package hackerRankPractice.thirtyDayChallenge.binarySearchTree;

class NonEmptyBST<D extends Comparable> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D element) {
        data = element;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D element, Tree<D> leftTree, Tree<D> rightTree){
        data = element;
        left = leftTree;
        right = rightTree;
    }

    public boolean isEmpty(){
        return false;
    }

    public int cardinality(){
        return 1 + left.cardinality() + right.cardinality();
    }
    // add everything in left and right tree

    public boolean member(D element){
        // root = data
        if (data == element){
            return true;
        } else {
            if (element.compareTo(data) < 0){
                return left.member(element);
            } else {
                return right.member(element);
            }
        }
    }

    public NonEmptyBST<D> add(D element) {
        if (data == element){
            return this;
        } else {
            if (element.compareTo(data) < 0){
                return new NonEmptyBST(data, left.add(element), right);
            } else {
                return new NonEmptyBST(data, left, right.add(element));
            }
        }
    }
}

/*

path finding algorithms: theory

1. breadth-first search
    say we have A with nodes B, C, and D attached
    discovers each node on a level of a tree before moving to the next level
    what is connected to A?
        directly
        indirectly
    implement with queues and stacks

2. depth-first search
    same question: what is connected to A?
    deeper in the tree first
    implement with stack/recursion and trees

importance? driving! flying! routes!

*/