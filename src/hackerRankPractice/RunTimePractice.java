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

public class RunTimePractice {

    // repetition function
    public static int findNumberOfRepetitions(String s, char c){
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                sum++;
            }
        }
        return sum;
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

e



*/



















