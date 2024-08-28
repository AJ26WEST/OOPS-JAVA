public class main {
    public static void main(String[] args){
        Human human1 =new Human("john",60,56);
        Human human2 = new Human("ricky",56,90);
        human1.eat();
     
        human2.old();
    }


}

2nd

public class Human {
    String name;
    int age;
    double wieght;

    Human(String name, int age, double wieght){
    this.name=name;
    this.age=age;
    this.wieght=wieght;
    }
    void eat(){
        System.out.println(this.name+" is eating food");
    }
     void drink(){
         System.out.println(this.name+" is drinking milk");
     }
     void old(){
         System.out.println(this.name+" is  "+this.age+" years old");
     }
}
