import java.util.Scanner;
public class Exe5{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first input:");
        int first=s.nextInt();

        System.out.println("Enter second input:");
        int second=s.nextInt();

        System.out.println("Addition:"+(first+second));
        System.out.println("Substraction:"+(first-second));
        System.out.println("Division:"+(first/second));
        System.out.println("Multiplication:"+(first*second));
    }

}
