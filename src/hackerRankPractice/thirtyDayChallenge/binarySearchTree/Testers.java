package hackerRankPractice.thirtyDayChallenge.binarySearchTree;

public class Testers {

    public static void checkIsEmpty(Tree t) throws Exception {
        // if the tree t is an instance of EmptyBST --> t.isEmpty -> true
        // if the tree t is an instance of NonEmptyBST --> t.isEmpty -> false
        if (t instanceof EmptyBST) {
            if (t.isEmpty()) {
                throw new Exception("All is not good, the tree is an EmptyBST and it is non-empty");
            }
        } else if (t instanceof NonEmptyBST) {
            if (t.isEmpty()) {
                throw new Exception("All is not good, the tree is a NonEmptyBST and it is empty");
            }
        }
    }

    // unit testing
    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = t.add(x).cardinality();
        // 1. either something was added -> and the cardinality increased by one
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception("The cardinality increased by one but the thing that " +
                        "was added was already a member of the tree");
            } else {
                System.out.println("All is good, our cardinality increased and the " +
                        "thing wasn't in the tree");
            }
        }
        // OR the thing that was added was already there and therefore not really added
        // so cardinality stayed the same
        else if (nT == t.cardinality()) {
            if (t.member(x)) {
                throw new Exception("The cardinality didn't increase by 1, but " +
                        "we added a new thing");
            } else {
                System.out.println("All is good, the thing was in the tree already and our " +
                        "cardinality didn't increase");
            }
        } else {
            throw new Exception("Something is wrong with our program");
        }
    }
}






















