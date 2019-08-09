import java.util.Scanner;
public class Ex14{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in Java:");
		System.out.println("a.int 1x=10");
		System.out.println("b.int x=10");
		System.out.println("c. float x=10.0f");
		System.out.println("d.string x=\"10\"");


		String x=s.next();
		switch(x){
			case "a":
				System.out.println("Invalid");
				break;	
			case "b":
				System.out.println("Correct");
				break;	
			case "c":
				System.out.println("Invalid");
				break;	
			case "d":
				System.out.println("Invalid");
				break;
			default:
				System.out.println("Bad Choice");
				
		}

	}
}