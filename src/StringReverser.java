//Without using any Java or JavaScript native methods, create a function that returns the reverse of a string
//        - The function will take one parameter, a string
//        - The function will return the reverse of the string
//        - Try these test cases:
//        - reverseString("hello") -> should return 'olleh'
//        - reverseString("Coding Nomads") -> should return 'sdamoN gnidoC'
//        - reverseString("Greetings from Earth") -> should return "htraE morf sgniteerG"
//        - reverseString("I'm a little teapot") -> should return 'topeat elttil a m'I'

public class StringReverser {

    public static void main(String[] args) {

        String reverse = reverseString("coronavirus");
        System.out.println(reverse);

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
