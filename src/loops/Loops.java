package loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {


        queries();


        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        // Your code goes here
    }

    public static void queries() {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i <= t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;
            for (int k = 0; k <= n - 1; k++) {
                result = (int) Math.pow(2, k) * b + result;
                System.out.print(a + result + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static void printConsonants(){

        // JAVA: will print JV but not AA
        // JAVA split into array with 4 indices: [J][A][V][A]
        // int currentIdx = 0;
        // Loop: if char at the current index is equal to a VOWEL, do not print
        // otherwise print
        // loop and if else statement

    }

}

