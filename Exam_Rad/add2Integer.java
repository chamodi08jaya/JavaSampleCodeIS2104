import java.util.Scanner;
public class add2Integer{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int x=s.nextInt();

		System.out.println("Enter second integer: ");
		int y=s.nextInt();

		int sum=x+y;
		System.out.println("The sum is "+sum);
		s.close();
	}
}