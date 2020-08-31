package hackerRankPractice.thirtyDayChallenge;

/*

Task
Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.

*/

public class BitwiseAND {

    public static void main(String[] args) {

        BinaryString1 binaryString1 = new BinaryString1("HackerRank");
        BinaryString1 binaryString2 = new BinaryString1(8675309);

        /*

        When run, it prints the following output:

        1001000 1100001 1100011 1101011 1100101 1110010 1010010 1100001 1101110 1101011
            // Binary for "H a c k e r R a n k"
        100001000101111111101101
            // Binary for the integer 8675309

        */

        BinaryString2 binaryString3 = new BinaryString2("HackerRank",8675309);

        /*

        The above code produces the following output:

        1001000 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
        1100001 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
        1100011 OR 100001000101111111101101 = 100001000101111111101111 = 8675311
        1101011 OR 100001000101111111101101 = 100001000101111111101111 = 8675311
        1100101 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
        1110010 OR 100001000101111111101101 = 100001000101111111111111 = 8675327
        1010010 OR 100001000101111111101101 = 100001000101111111111111 = 8675327
        1100001 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
        1101110 OR 100001000101111111101101 = 100001000101111111101111 = 8675311
        1101011 OR 100001000101111111101101 = 100001000101111111101111 = 8675311

        Notice that the first 17 bits (1000010001011111111) are always the same.
        This is because bit position is counted starting with the least-significant
        (rightmost) bit and then it moves left so, in the example above, the only
        values with the potential to change are the lower (rightmost) 7 bits
        (as that is the number of bits in the smaller operand). For each bit position
        in the lower 7 bits, an OR operation is performed. If we were to again modify
        the above code to print the exclusive OR (instead of the inclusive OR),
        we would get this output:

        1001000 XOR 100001000101111111101101 = 100001000101111110100101 = 8675237
        1100001 XOR 100001000101111111101101 = 100001000101111110001100 = 8675212
        1100011 XOR 100001000101111111101101 = 100001000101111110001110 = 8675214
        1101011 XOR 100001000101111111101101 = 100001000101111110000110 = 8675206
        1100101 XOR 100001000101111111101101 = 100001000101111110001000 = 8675208
        1110010 XOR 100001000101111111101101 = 100001000101111110011111 = 8675231
        1010010 XOR 100001000101111111101101 = 100001000101111110111111 = 8675263
        1100001 XOR 100001000101111111101101 = 100001000101111110001100 = 8675212
        1101110 XOR 100001000101111111101101 = 100001000101111110000011 = 8675203
        1101011 XOR 100001000101111111101101 = 100001000101111110000110 = 8675206

        */

    }
}

/*

LOGICAL STATEMENTS AND BOOLEAN ALGEBRA
-instead of using T or F, boolean algebra uses binary numbers 1 for true and 0 for false

BASIC OPERATORS
    & Bitwise AND
        -binary operation evaluates to 1 (true) if both operands are true, otherwise 0 (false)
            1 & 1 = 1
            1 & 0 = 0
            0 & 1 = 0
            0 & 0 = 0
    | Bitwise Inclusive OR
        -binary operation evaluates to 1 if either operand is true, otherwise 0 (false) if both operands are false
            1 | 1 = 1
            1 | 0 = 1
            0 | 1 = 1
            0 | 0 = 0
    ^ Bitwise Exclusive OR or XOR
        -binary operation evaluates to 1 (true) if and only if exactly one of the two operands is 1; if both operands
        are 1 or 0, it evaluates to 0 (false)
            1 ^ 1 = 0
            1 ^ 0 = 1
            0 ^ 1 = 1
            0 ^ 0 = 0
    ~ the unary Bitwise Complement
        -operator flips every bit; for example, the bitwise-inverted 8-bit binary number 01111001 becomes 10000110
        and the bitwise-inverted signed decimal integer 8 becomes -9

the code below converts a wod and an integer to binary strings:

*/

class BinaryString1 {

    BinaryString1(String string) {
        for (byte b : string.getBytes()) {
            System.out.println(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    BinaryString1(Integer integer) {
        System.out.println(Integer.toBinaryString(integer));
    }

}

class BinaryString2 {
    BinaryString2(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);

        for (byte b: string.getBytes()){
            // perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b | integer;
            System.out.println(Integer.toBinaryString(b) + " OR " +
                    Integer.toBinaryString(integer) + " = " + tmp);
        }
    }
}

