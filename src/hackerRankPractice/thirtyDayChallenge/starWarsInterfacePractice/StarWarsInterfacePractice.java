package hackerRankPractice.thirtyDayChallenge.starWarsInterfacePractice;

/*

interface: collection of abstract methods
    -template of functionality
    -no implementations
    -no constructors
    -abstract -> "bare bones"
    -example: want the ability to compare objects of a certain class?
        -> comparable interface
        certain data structure will have compare to (array to array, string to string)


difference between interface and abstract class?

*/

import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character summonCharacter(){
        Random random = new Random();
        if (Math.abs(random.nextInt()) % 2 ==0){
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {

        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }

}

/*

interfaces
-can extend other interfaces (same type of idea as inheritance)
-interface Character {}
    interface Jedi extends Character {}
-are all about functionality
    classes usually do not deal with same stuff
-only way to use interface is to create class that implements that interface
-cannot instantiate just an interface

REMEMBER: implement an interface, extend a class



*/