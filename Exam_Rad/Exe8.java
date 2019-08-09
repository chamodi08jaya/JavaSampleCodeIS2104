import java.util.Scanner;
public class Exe8{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("The amount of deposit:");
        double amount=s.nextDouble();

         System.out.println("The amount of yearly interest rate in percentage:");
        double rate=s.nextDouble();

         System.out.println("The amount of income tax percentage :");
        double income=s.nextDouble();

        double interest=amount*(rate/100);
        double tax=interest*(income/100);

        double total=interest-tax;

        System.out.println("The amount of interest earned in the year:"+String.format("%.2f",total));
    }
}