package hackerRankPractice.thirtyDayChallenge;

public class RecursionGoodLuck {

    // f(f(f(x))) --- x = 20
    // f(a) = f + a
    // f(20) = 5 + 20 = 25

    // f(f(f(20))) --- f(f(25))
    // f(25) = 5 + 25 = 30

    // f(f(f(20))) --- f(f(25)) ---- f(30)
    // f(30) = 5 + 30 = 25

    // f(f(f(20))) --- f(f(25)) ---- f(30) --- 35

    // summation 5+4+3+2+1+0; 7+6+5+4+3+2+1+0; 1; 2+1+0

    // 3+2+1
    public static int Summation(int n) {
        // base case: we are at the end
        if (n <= 0) {
            return 0; // additive identity property
            // recursive case: keep going
        } else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
            return n + Summation(n - 1);
        }
    }

    // factorial 5! = 5*4*3*2*1 --> 5*4!
    // factorial 4! = 4*3*2*1
    public static int Factorial(int n) {
        // base case
        if (n <= 1) { // multiplicative identity
            return 1;
        }
        // recursive case
        else {
            // Factorial(4) = 4 * Factorial(3)
            // 4 * 3 * Factorial(2)
            // 4 * 3 * 2 * Factorial(1)
            // 4 * 3 * 2 * 1
            return n * Factorial(n - 1);
        }
    }

    // 5^3 = 5 * 5 * 5
    // 5^3 = 5 * 5^2 = 5 * 5 * 5^1 = 5 * 5 * 5 * 5^0 = 5 * 5 * 5 * 1
    public static int Exponentiation(int n, int p) {
        // base case
        if (p <= 0) {
            return 1; // multiplicative identity

        }
        // recursive
        else {
            // 5 * exponentiation(5,2)
            // 5 * 5 * exponentiation(5,1)
            // 5 * 5 * 5 * exponentiation(5,0)
            // 5 * 5 * 5 * 1
            return n * Exponentiation(n,p-1);
        }
    }

    public static void main(String[] args) {
        int summation = Summation(3);
        int factorial = Factorial(4);
        int exponentiation = Exponentiation(5,4);
        System.out.println(summation);
        System.out.println(factorial);
        System.out.println(exponentiation);
    }
}











































