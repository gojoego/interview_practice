package hackerRankPractice.thirtyDayChallenge.starWarsInterfacePractice;

public interface Character {

    // can have properties in an interface
    public String base = "character"; // static

    public void attack();
    public void heal();
    public String getWeapon();
}
