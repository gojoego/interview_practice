import java.util.Scanner;

public class StdinStdout {

    public static void main(String[] args) {

        tripleScan();

    }

    public static void simpleScan(){

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);

    }

    public static void tripleScan(){

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        double d = scanner.nextDouble();

        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }

}
