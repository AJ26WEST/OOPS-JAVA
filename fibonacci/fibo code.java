import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int terms;
        System.out.println("enter the number of terms : ");
        terms = scanner.nextInt();
        int t1=0,t2=1;
        System.out.println("Fibonacci series : ");
         for (int i =1;i<=terms ; i++){
             System.out.print(t1+ " ");
             int sum =t1+t2;
             t1=t2;
             t2=sum;
         }
    }
}
