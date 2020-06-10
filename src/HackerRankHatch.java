
public class HackerRankHatch {

    public static void main(String[] args) {

    }

    public static String[] matchingPrefixes(String[] number, String[] prefixes){
        for (String s: number) {
            String tempLongest = "";
            for (String n: prefixes){
                if(s.startsWith(n)){
                    if (n.length()>tempLongest.length()){
                        tempLongest = n;
                    }
                }
            }
        } //tests for behavior
        return number;
    }


}
