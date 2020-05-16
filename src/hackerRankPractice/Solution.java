//package hackerRankPractice;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//class Result {
//
//    /*
//     * Complete the 'match' function below.
//
//     * prefixes and phone numbers matching
//     *
//     * The function is expected to return a STRING_ARRAY.
//     * The function accepts following parameters:
//     *  1. STRING_ARRAY prefixes
//     *  2. STRING_ARRAY numbers
//     */
//
//    public static void match(List<String> prefixes, List<String> numbers) {
//
//        Object[] prefixesArray = prefixes.toArray();
//
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int prefixesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> prefixes = new ArrayList<>();
//
//        for (int i = 0; i < prefixesCount; i++) {
//            String prefixesItem = bufferedReader.readLine();
//            prefixes.add(prefixesItem);
//        }
//
//        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> numbers = new ArrayList<>();
//
//        for (int i = 0; i < numbersCount; i++) {
//            String numbersItem = bufferedReader.readLine();
//            numbers.add(numbersItem);
//        }
//
//        List<String> result = Result.match(prefixes, numbers);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(result.get(i));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}