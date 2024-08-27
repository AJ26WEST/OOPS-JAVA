  public class car {
    String make="FORD";
    String model="mck2029";
    int year =2026;
    String colour="nigga";
    double price =2000000;

    void drive(){
        System.out.println("you drive the car");
    }
    void brake(){
        System.out.println("brake that shit");
    }
}



//make another folder

public class mai {

    public static void  main(String[] args){

        car mycar = new car();

        System.out.println(mycar.colour);
        System.out.println(mycar.make);
        System.out.println(mycar.model);
        mycar.drive();
        mycar.brake();

    }
}

