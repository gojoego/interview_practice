/*

    1. Write a temperature conversion function
        - The function will take two parameters: the temp, and the current unit of temp (either 'C' or 'F')
        - If the current temp is fahrenheit, return the temp in celsius and vice versa
        - Try these test cases:
        - convertTemeprature(32, "C") -> Should return 89.6 F
        - convertTemeprature(32, "F") -> Should return 0 C
        - convertTemeprature(20, "C") -> Should return 68 F
        - convertTemeprature(98, "F") -> Should return 36.667 C

    2. Without using any Java or JavaScript native methods, create a function that returns the reverse of a string
        - The function will take one parameter, a string
        - The function will return the reverse of the string
        - Try these test cases:
        - reverseString("hello") -> should return 'olleh'
        - reverseString("Coding Nomads") -> should return 'sdamoN gnidoC'
        - reverseString("Greetings from Earth") -> should return "htraE morf sgniteerG"
        - reverseString("I'm a little teapot") -> should return 'topeat elttil a m'I'

    3. Write a function that returns the factorial addition of a number ( i.e.; 5 factorial  is 1 + 2 + 3 + 4 + 5 = 15 )
        - The function will take one parameter, a number
        - The function will return the factorial of that number
        - Bonus: write the function as a recursive function
        - Test cases:
        - factorial(5) -> returns 15
        - factorial(120) -> returns 55
        - factorial(545) -> returns 120
        - factorial(20) -> returns 210

    4. Find the longest word in the provided string
        - The function will take one parameter, a string
        - The function will return a number that indicates the length of the longest word in the string
        - Test cases:
        - findLongestWordLength("The quick brown fox jumped over the lazy dog") should return 6.
        - findLongestWordLength("May the force be with you") should return 5.
        - findLongestWordLength("Google do a barrel roll") should return 6.
        - findLongestWordLength("What is the average airspeed velocity of an unladen swallow") should return 8.
        - findLongestWordLength("What if we try a super-long word such as otorhinolaryngology") should return 19.

    5. Return Largest Numbers in Arrays
        - The function will take in n array of arrays
        - The function will return an array consisting of the largest number from each provided sub-array.
        - Test cases:
        - largestOfFour([[14, 35, 21, 53], [143, 427, 418, 246], [352, 355, 375, 359]]) should return [53, 427, 375].
        - largestOfFour([[13, 27, 18, 26], [4, 5, 1, 3], [32, 35, 37, 39], [1000, 1001, 857, 1]]) should return [27, 5, 39, 1001]
        - largestOfFour([[4, 9, 1, 3], [13, 35, 18, 26], [32, 35, 97, 39], [1000000, 1001, 857, 1]]) should return [9, 35, 97, 1000000]
        - largestOfFour([[17, 23, 25, 12], [25, 7, 34, 48], [4, -10, 18, 21], [-72, -3, -17, -10]]) should return [25, 48, 21, -3]
*/

public class AlgoChallenge {

    public static void main(String[] args) {

        // temperature conversion function
        convertTemp(32, "C");
        convertTemp(32, "F");
        convertTemp(20, "C");
        convertTemp(98, "F");

        System.out.println();

        // string reversing function
        String reversed1 = reverseString("hello");
        System.out.println("\"hello\" reversed is " + "\"" + reversed1 + "\"");

        String reversed2 = reverseString("Coding Nomads");
        System.out.println("\"Coding Nomads\" reversed is " + "\"" + reversed2 + "\"");

        String reversed3 = reverseString("Greetings from Earth");
        System.out.println("\"Greetings from Earth\" reversed is " + "\"" + reversed3 + "\"");

        String reversed4 = reverseString("I'm a little teapot");
        System.out.println("\"I'm a little teapot\" reversed is " + "\"" + reversed4 + "\"");

    }

    public static void convertTemp(double temp, String metricOrNo) {

        if (metricOrNo.equalsIgnoreCase("C")) {
            double fahrenheit = (temp * 1.8) + 32;
            System.out.println(temp + " degrees Celsius = " + fahrenheit + " Fahrenheit" );
        } else {
            double celsius = (temp - 32) / 1.8;
            System.out.println(temp + " degrees Fahrenheit = " + celsius + " Celsius");
        }
    }

    public static String reverseString(String word) {

        char[] wordArray = word.toCharArray();
        char[] secondArray = new char[wordArray.length];
        int j = 0;

        for (int i = wordArray.length - 1; i >= 0; i--) {
            secondArray[j] = wordArray[i];
            j++;
        }
        return new String(secondArray);
    }

}