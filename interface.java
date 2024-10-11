/*
 * Name: ABHISHEK JOJI
 * Date: 30-09-2024
 * Purpose: Write a Java program that implements an interface and demonstrates the concept of inheritance.
 *          This program defines various animals with specific behaviors and integrates the Pet interface for some animals.
 */

class Animal {
    int legs;

    // Constructor to initialize the number of legs for an animal
    Animal(int legs) {
        this.legs = legs;
    }

    // Method to simulate walking behavior for the animal
    void walk() {
        System.out.print("\nThis animal walks on " + legs + " legs");
    }

    // Method to simulate the eating behavior of the animal
    void eats() {
        System.out.print("\nThis animal eats");
    }
}

// Interface Pet with methods to be implemented by pet animals
interface Pet {
    String getName();
    void setName(String name);
    void play();
}

// Class Spider extends Animal but does not implement Pet
class Spider extends Animal {
    Spider(int legs) {
        super(legs);
    }

    // Spider's specific eat method
    void eat() {
        System.out.print("\nSpider eats insects.");
    }
}

// Class Cat extends Animal and implements Pet interface
class Cat extends Animal implements Pet {
    String name;

    // Constructor for Cat that initializes its name and number of legs
    Cat(String name, int legs) {
        super(legs);
        this.name = name;
    }

    // Implementation of getName method from Pet interface
    public String getName() {
        return name;
    }

    // Implementation of setName method from Pet interface
    public void setName(String name) {
        this.name = name;
    }

    // Implementation of play method from Pet interface
    public void play() {
        System.out.print("\nCat loves to play with ball");
    }

    // Override eat method to provide Cat-specific behavior
    public void eats() {
        System.out.print("\nCat eats fish");
    }
}

// Class Fish extends Animal and implements Pet interface
class Fish extends Animal implements Pet {
    String name;

    // Constructor for Fish that initializes its name and number of legs
    Fish(String name, int legs) {
        super(legs);
        this.name = name;
    }

    // Implementation of getName method from Pet interface
    public String getName() {
        return name;
    }

    // Implementation of setName method from Pet interface
    public void setName(String name) {
        this.name = name;
    }

    // Override eat method to provide Fish-specific behavior
    public void eats() {
        System.out.print("\nFish eats plants");
    }

    // Implementation of play method from Pet interface
    public void play() {
        System.out.print("\nFish likes to play with shells");
    }

    // Override walk method since Fish doesn't walk like other animals
    public void walk() {
        System.out.print("\nFish has no legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Create an Animal object with 4 legs
        Animal a = new Animal(4);

        // Working with Fish object
        System.out.print("\n\nFish");
        Fish f = new Fish("Mimi", 0);
        System.out.print("\nThis fish's name is " + f.getName());
        f.eats();
        f.walk();
        f.setName("Nemo");
        System.out.print("\nThis fish's name is " + f.getName());

        // Working with Cat object
        System.out.print("\n\nCat");
        Cat c = new Cat("Tom", 4);
        System.out.print("\nThis cat's name is " + c.getName());
        c.eats();
        c.walk();
        c.setName("Tim");
        System.out.print("\nThis cat's name is " + c.getName());

        // Working with Spider object
        System.out.print("\n\nSpider");
        Spider s = new Spider(8);
        s.eat();
        s.walk();
    }
}
