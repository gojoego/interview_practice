package hackerRankPractice.thirtyDayChallenge.binarySearchTree;

public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST(){

    }

    public boolean isEmpty(){
        return true;
    }

    public int cardinality(){
        return 0;
    }

    public boolean member(D element){
        return false;
    }


    public NonEmptyBST<D> add(D element) {
        return new nonEmptyBST<D>(element);
    }
}
