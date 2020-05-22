package hackerRankPractice.challenge.guessTheNumber;

/*

class method: no instance needed to use this function

*/

public class GuessTheNumber {

    public static void main(String[] args) {

        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(11);
        howBigIsMyNumber(100);
        howBigIsMyNumber(5);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);

    }

    public static void howBigIsMyNumber(int x){
        if (x >= 0 && x <= 10){
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100){
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

}
