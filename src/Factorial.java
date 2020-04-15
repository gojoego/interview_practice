/*

3. Write a function that returns the factorial addition of a number
( i.e.; 5 factorial  is 1 + 2 + 3 + 4 + 5 = 15 )
    - The function will take one parameter, a number
    - The function will return the factorial of that number
    - Bonus: write the function as a recursive function
    - Test cases:
        - factorial(5) -> returns 15
        - factorial(120) -> returns 55
        - factorial(545) -> returns 120


*/

public class Factorial {

    public static void main(String[] args) {
        System.out.println();
    }

    public static int factorial(int x) {
        int factorialSum = 0;
        for (int i = 0; i <= x; i++) {
            factorialSum += 1;
        }
        return factorialSum;
    }

    public static int recursiveFactorial(int x){
        if (x == 0){
            return 1;
        }else{
            return (x + recursiveFactorial(x -1));
        }
    }
}
