package hackerRankPractice.challenge;

/*

loop:   a control flow statement that allows code to be executed repeatedly based on some given condition;
        like repeating if statements

all loops consist of:

1. a condition
2. a block of code to be executed if the condition is true

for loop: give and increment a variable automatically

while/do: do not give or increment a variable automatically

*/

public class LoopPractice {

    public static void main(String[] args) {

        System.out.println("While Loop");
        practiceWhileLoop();
        System.out.println("Do While Loop");
        practiceDoWhileLoop();
        System.out.println("For Loop Incrementing");
        practiceForLoopIncrement();
        System.out.println("For Loop Decrementing");
        practiceForLoopDecrement();
        System.out.println("Nested For Loop");
        practiceNestedForLoop();

    }

    private static void practiceNestedForLoop() {
        for (int x = 0; x < 10; x++){
            for (int y = 0; y < 10; y ++){
                System.out.println("("+x+","+y+")");
            }
        }
    }

    private static void practiceForLoopDecrement() {
        for (int x = 10; x > 0; x--) {
            System.out.println("The value of x is " + x);
        }
    }

    public static void practiceWhileLoop() {
        int x = 0;
        // repeating if statement: while loop
        while (x < 5) {
            System.out.println("The value of x is " + x);
            x++; // x = x + 1;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoopIncrement() {
        for (int x = 0; x < 20; x++) {
            System.out.println("The value of x is " + x);
            if (x == 10) {
                break;
            }
        }
        System.out.println("This is the end");
    }

}
