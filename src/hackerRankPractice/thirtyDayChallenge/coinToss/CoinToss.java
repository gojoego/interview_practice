package hackerRankPractice.thirtyDayChallenge.coinToss;

import java.util.Random;

public class CoinToss {

    public static void main(String[] args) {

        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }

    public String tossACoin() {
        Random random = new Random();
        int toss = Math.abs(random.nextInt()) % 2;
        if (toss == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
}

/*

class: blueprint with tools (properties and methods)

instance: an object created from the blueprint

if (condition){
    condition true: do this
    } else {
    condition false: do this
    }

*/