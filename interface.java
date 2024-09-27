class Animal{
    int legs;
    Animal(int legs){
        this.legs = legs;
    }
    void walk(){
        System.out.print("\nThis animal walks on"+ legs + "legs");
    }
    void eats(){
        System.out.print("\n This animal eats ");
    }

}

interface Pet{
    String getName();
    void setName(String name);
    void play();
}
class Spider extends Animal{
    Spider(int legs){
        super(legs);
    }
    void eat(){
        System.out.print("\n Spider eats insects.");
    }
}
class Cat extends Animal implements Pet{
    String name;
    Cat(String name, int legs){
        super(legs);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.print("\nCat loves to play with ball");
    }
    public void eats(){
        System.out.print("\n Cat eats fish");
    }
}

class Fish extends Animal implements Pet{
    String name;
    Fish(String name, int legs){
        super(legs);
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void eats(){
        System.out.print("\n Fish eats plants");
    }
    public void play(){
        System.out.print("\n Fish likes to play with shells");
    }
    public void walk(){
        System.out.print("\n Fish has no legs");
    }
}
public class Interface{
    public static void main(String[] args){
        Animal a = new Animal(4);

        System.out.print("\n\nFish");
        Fish f = new Fish("Mimi",0);
        System.out.print("\nThis fish's name is "+f.getName());
        f.eats();
        f.walk();
        f.setName("Nemo");
        System.out.print("\nThis fish's name is "+f.getName());

        System.out.print("\n\nCat");
        Cat c = new Cat("Tom",4);
        System.out.print("\nThis cat's name is "+c.getName());
        c.eats();
        c.walk();
        c.setName("Tim");
        System.out.print("\nThis cat's name is "+c.getName());

        System.out.print("\n\nSpider");
        Spider s = new Spider(8);
        s.eat();
        s.walk();
    }
}
