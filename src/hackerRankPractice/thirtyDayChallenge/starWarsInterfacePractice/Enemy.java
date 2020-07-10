package hackerRankPractice.thirtyDayChallenge.starWarsInterfacePractice;

// when implementing an interface, you'll get an error until you implements all of the methods in the interface

public class Enemy implements Character{

    public String weapon = "lightsaber";

    public Enemy(){}

    public String getWeapon(){
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw(){
        System.out.println("draw out weapon");
    }
}
