package hackerRankPractice.thirtyDayChallenge.binarySearchTree;

public interface Tree<D extends Comparable> {

    // signatures
    public boolean isEmpty(); // nonEmpty true, Empty false
    public int cardinality(); // size of tree, if empty zero, non-empty will have size, using recursion
    public boolean member(D element);
    public NonEmptyBST<D> add(D element);

}
