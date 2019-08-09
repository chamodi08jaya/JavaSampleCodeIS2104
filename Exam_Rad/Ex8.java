import java.util.Scanner;
public class Ex8{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("The amount of deposit:");
		float x=s.nextFloat();
		System.out.println("Yearly interest rate in percentage:");
		float y=s.nextFloat();
		System.out.println("Income tax rate in percentage:");
		float z=s.nextFloat();

		float Income;
		Income=x*(y/100);
		float m;
		m=Income*(z/100);
		float interest;
		interest=Income-m;

		System.out.println("Interest:"+interest);
		

		
	}

}