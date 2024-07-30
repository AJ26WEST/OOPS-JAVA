import java.util.*;
class freq {
    public static void main(String[] args) {
       String s1;
       int count =0,len;
       char key;
       Scanner sc =new Scanner(System.in);
       System.out.println("enter a String=");
       s1 = sc.nextLine();
       System.out.println("enter the character to fine out ");
       key =sc.next().charAt(0);
       len=s1.length();
       for ( int i=0;i<len;i++){
           if(s1.charAt(i)==key){
               count++;
           }
       }
       System.out.println("the count of "+ key + " is "+count);
    }
}
