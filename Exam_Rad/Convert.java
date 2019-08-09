import java.util.Scanner;
public class Convert{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);

       System.out.println("Enter string: ");
       String x=s.next();

        System.out.println("Enter string: ");
       String h=s.next();

         System.out.println(x+h);

       int y=Integer.parseInt(x);
       System.out.println("String convert into int "+y);

     int m=Integer.parseInt(h);
       System.out.println("String convert into int "+m);

        System.out.println(m+y);

    }
}