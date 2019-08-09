import java.util.Scanner;
public class Exe7{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        float x=s.nextFloat();

        System.out.println("Enter second number:");
        float y=s.nextFloat();

        x=x+y;
        System.out.println("Total:"+x);

    }
}