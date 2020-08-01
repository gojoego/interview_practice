package hackerRankPractice.thirtyDayChallenge;

/*



*/

public class MoreLinkedLists {
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