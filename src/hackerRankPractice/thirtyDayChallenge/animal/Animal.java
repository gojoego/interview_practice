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

public abstract class Animal {

    public int age; // vs private int age;
    // if making private, can utilize getters
    // allows control of who has access to the age property

    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    // HAPPY = 10
    // f(x) = x + 5 + HAPPY
    // f(z,d) = z + d + HAPPY
    // where something is declared is where something lives
    public void doSomething (String thing){
        System.out.println("I'm doing " + thing);
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("An animal is sleeping.");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

//        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();

        Object str = "est";
        String realS = (String) str;
        realS.getBytes();
        // usually less defined to something more specific

        // what happens when...
        Dog doggy = new Dog();
        if (d instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();

//        d.ruff();
//        System.out.println(d.age);
//        c.meow();
//        System.out.println(c.age);
//        a.eat();
//        d.eat();
//        c.eat();
//        d.run();
//        c.prance();

        // what happens if...
//        Animal o = new Dog();
        // cannot... Dog o = new Animal(3);
    }
}

/*

what are we doing?
-abstract classes
-abstract methods
-instance of
-type casting

what is an abstract class?
1. class with at least one abstract method, a method declared without an implementation
2. may have abstract and non-abstract methods
3. cannot be initialized

* abstract methods do NOT have a body

* both abstract and non-abstract classes can override methods

abstract classes vs. overriding methods:
-classes that extend abstract classes must implement abstract methods or be abstract themselves
-with abstract classes, a method may not be defined, the program does not know what to do
-with overriding methods, there is an implementation at a superclass level
-implemented method in superclass: may or may not be overridden in subclass

type casting
-casting: converting data type to another data type

scope = lifetime and accessibility of a variable

4 levels of scope 
-class
-method
-public vs private
-loop


*/