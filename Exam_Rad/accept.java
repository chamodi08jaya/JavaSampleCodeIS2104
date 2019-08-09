import java.util.Scanner;
public class accept{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=s.nextInt();

        if(x%2==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}