package hackerRankPractice.thirtyDayChallenge.animal;

/*

what is inheritance?
-allows you to build new classes from existing classes
-reuse code
-defines the relationship between the superclass and the subclass

traits:
parent superclass = has the trait originally
child subclass = inherits the trait

* everything in code that is referenced inherits from object
* object is the superclass of things we create in java

object = superclass
animal = subclass

* a subclass can be generalized to a superclass
* a superclass cannot become a more specific subclass

*/

public class Animal {

    public int age; // vs private int age;
    // if making private, can utilize getters
    // allows control of who has access to the age property

    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public void eat(){
        System.out.println("An animal is eating");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.age);
        c.meow();
        System.out.println(c.age);
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();

        // what happens if...
        Animal o = new Dog();
        // cannot... Dog o = new Animal(3);
    }
}
