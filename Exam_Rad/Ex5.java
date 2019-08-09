import java.util.Scanner;
public class Ex5{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Input:");
		int x=s.nextInt();

		System.out.println("Enter second Input:");
		int y=s.nextInt();
		int a,b,c,d;
		a=x+y;
		System.out.println("addition "+a);
		b=x-y;
		System.out.println("substraction "+b);
		c=x*y;
		System.out.println("multiplication "+c);
		d=x/y;
		System.out.println("division "+d);
	}
}