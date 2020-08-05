package hackerRankPractice;

/*

what makes one version of code better than another?
1.  efficiency
    10 min vs 10 hours, 10 min is better because it is faster
2.  space
    500gb vs 1GB, 1GB would be better but what if 500GB is much faster
    this dilemma is called the space-time trade off
3.  Elegance
    wished but not necessary

speed is the most important (for the most part)

how do we figure out the time?
A.  timer straight up
B.  See what the code does


*/

import sun.awt.AWTIcon32_security_icon_bw16_png;

import java.util.ArrayList;
import java.util.HashMap;

public class RunTimePractice {

    // repetition function
    public static int findNumberOfRepetitions(String s, char c){
        // linear time; O(n) time
        int sum = 0; // 1
        for (int i = 0; i < s.length(); i++){ // 1, n + 1, n
            if (s.charAt(i) == c){ // n
                sum++; // n
            }
        }
        return sum; // 1
    }

    public static int[] findNumsOfRepetitionsv1(String s, char[] c){
        // quadratic time; O(n * m)
        int[] sums = new int[c.length]; // constant 1
        for (int i = 0; i < s.length(); i++){ // 1, n + 1, n
            for (int j = 0; j < c.length; j++){ // n, n * m + 1, n * m
                if (s.charAt(i) == c[j]){ // n * m
                    sums[j] = sums[j] + 1; // n * m
                }
            }
        }
        return sums; // 1
    }

    // using data structure to create a more optimal solution
    public static int[] findNumsOfRepetitionsv2(String s, char[] c){
        // using hashmaps dictionaries to make this running time O(n)
        // optimal time: O(n * m)
        int[] sums = new int[c.length]; // constant 1
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }
        return sums;
    }

    public static void main(String[] args) {

        // setting a timer
        long startTime = System.currentTimeMillis();

        findNumberOfRepetitions("abdaafiashfkjasdfhaskjlfhsadljfh", 'a');

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        System.out.println("Test " + duration + " ms");
    }

}

/*

runtime complexity
-how fast is a given function based on a given input of size n
-how fast the function runs in proportion to its input

running time
-how fast a given function is based on input n

* how fast the code runs in proportion to its input *

example:    input n = 100; will program run for 200ms, 100ms, 50ms?
            two functions p1 and p2
            p1: 1 sec
            p2: 10 sec
            p1 better because it is faster

complexities:

O(1) -> constant does not depend on input
    example:    input   time
                100     10ms
                1000    10ms
                10000   10ms

O(log(n)) -> logarithmic
    example:    input   time
                16      3ms
                200+    4ms
                +++     20ms (still pretty quick)

O(n) -> linear (have to go through each element once)
    example:    input   time
                100     100ms
                1000    1000ms
                10000   10000ms
    size problem == size of the solution

O(n^2) -> quadratic (nested for loops)
    have to go through input once and another n times: outer and inner loop
    example:    input  time
                10     100ms
                100    10000ms
                4      16ms



*/



















