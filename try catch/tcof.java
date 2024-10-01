import java.util.Scanner;
class AgeVerify{
       void vote (int age) throws IllegalAccessException{
          try{
               if(age<18){
                  throw new IllegalAccessException("you must be at least 18 years old to vote.");
               }else{
                  System.out.println("you can vote!");
               }
          }catch (Exception e) {
                System.out.println("exception occured:" + e);
           }finally{
                System.out.println("Finally age verification done.");
           }
       }
}

public class usageoftry{
      public static void main(String[] args) throws IllegalAccessException {
             Scanner sc =new Scanner(System.in);
             int age;
             System.out.println("Enter age of voter:");
             age =sc.nextInt();
             AgeVerify av=new AgeVerify();
             av.vote(age);
             System.out.println("Verification completed successfully");
        }
}
