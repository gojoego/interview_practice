package hackerRankPractice.thirtyDayChallenge;
import java.util.*;

/*

TASK
Your company needs a function that meets the following requirements:
-For a given array of n integers, the function returns the index of the element with the
minimum value in the array. If there is more than one element with the minimum value, the
returned index should be the smallest one.
-If an empty array is passed to the function, it should raise an Exception.

Note: The arrays are indexed from 0.

A colleague has written that function, and your task is to design 3 separated unit tests,
testing if the function behaves correctly.

Another co-worker has prepared functions that will perform the testing and validate returned
results with expectations. Your task is to implement 3 classes that will produce test data and
the expected results for the testing functions. More specifically: function get_array() in
TestDataEmptyArray class and functions get_array() and get_expected_result() in classes
TestDataUniqueValues and TestDataExactlyTwoDifferentMinimums following the below specifications:
    -get_array() method in class TestDataEmptyArray has to return an empty array.
    -get_array() method in class TestDataUniqueValues has to return an array of size at least 2 with
        all unique elements, while method get_expected_result() of this class has to return the expected
        minimum value index for this array.
    -get_array() method in class TestDataExactlyTwoDifferentMinimums has to return an array where
        there are exactly two different minimum values, while method get_expected_result() of this class
        has to return the expected minimum value index for this array.

*/

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

import java.util.LinkedHashSet;

public class Testing {

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }

    public static int minimum_index(int[] seq) {
        // if the sequence length array is 0, it means there is no array or it is an empty sequence/array
        // if this happens, we throw this exception
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from " +
                    "an empty sequence");
        }
        // declaring and initializing minimum index to 0, declare outside of loop so we can access outside of it
        int min_idx = 0;
        // for loop that starts at 1 and does not get larger than length of the seq array and increments by 1
        // if the index at seq[i] is smaller than the minimum index, then the minimum index is now equal to
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        // at the end of the loop, return the minimum index
        // at this point, we have iterated through every index and have found the smallest value
        return min_idx;
    }


    static class TestDataEmptyArray {
        // this method has to return an empty array
        public static int[] get_array() {
            // complete this function
            int[] array = {};
            return array;
        }
    }

    static class TestDataUniqueValues{
        // has to return an array of at least 2 arrays with all unique elements
        public static int[] get_array(){
            // complete this function
            int[] array = new int[]{22, 28, 14, 89, 87, 85, 81, 83};
            return array;
        }
        // this method has to return the expected minimum value index for this array
        public static int get_expected_result(){
            // complete this function
            int minimumValue = 14;
            return minimumValue;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        // has to return an array where there are exactly two minimum values
        public static int[] get_array(){
            // complete this function
            int[] array = new int[]{22, 28, 14, 14, 87, 85, 81, 83};
            return array;
        }
        // has to return the expected minimum value index for this array
        public static int get_expected_result(){
            // complete this function
            int minimumValue = 14;
            return minimumValue;
        }
    }

    // utilizes try/catch statement and throws an AssertionError if the try/catch fails too
    public static void TestWithEmptyArray(){
        // try statement: create an int array called seq and set it equal to the array
        // from the method get_array() from the TestDataEmptyArray class
        try{
            int[] seq = TestDataEmptyArray.get_array();
            // taking the seq array and running it through the minimum_index() method
            // and setting it equal to an int variable called result
            int result = minimum_index(seq);
        // catch part of statement where if there is an illegal argument we just return
        }catch (IllegalArgumentException e){
            return;
        }
        // if the catch statement doesn't catch an error we throw this new one
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    // unit test
    public static void TestWithUniqueValues(){
        // declaring an int array called seq that we set equal to the array from TestDataUniqueValues
        int[] seq = TestDataUniqueValues.get_array();
        // throw error if the sequence length is less than 2
        if (seq.length < 2){
            throw new AssertionError("less than 2 elements in the array");
        }

        // creating an array of type Integer that is the length of seq array (declaring and initializing)
        Integer[] tmp = new Integer[seq.length];
        // creating for loop that starts at 0 and stops when i is less than its length, increments by 1
        for (int i = 0; i < seq.length; i++){
            // for temp array at i, will equal the Integer value of seq at index i
            tmp[i] = Integer.valueOf(seq[i]);
        }

        // if the size of the new linked hash set of type Integers from the tmp array is equal to the
        // length of seq then throw a new AssertionError
        if (!((new LinkedHashSet<Integer>(java.util.Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums(){
        // creating int array called seq that is equal to array from class
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        // if length of array seq is less than 2 then throw error
        if (seq.length < 2){
            throw new AssertionError("less than 2 elements in the array");
        }

        // creating int array called tmp and setting it equal to a clone of seq
        int[] tmp = seq.clone();
        // taking array and running it through sort method
        java.util.Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))){
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result){
            throw new AssertionError("result is different than the expected result");
        }

    }
}




















