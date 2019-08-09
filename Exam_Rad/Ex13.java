import java.util.Scanner;
public class Ex13{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Press any Key:");
		String x=s.next();
		//char y=x;
		switch(x)
		{
			case "0":
				System.out.println("Press number 0");
				break;
			case "1":
				System.out.println("Press number 1");
				break;
			case "2":
				System.out.println("Press number 2");
				break;
			case "3":
				System.out.println("Press number 3");
				break;
			case "4":
				System.out.println("Press number 4");
				break;
			case "5":
				System.out.println("Press number 5");
				break;
			case "6":
				System.out.println("Press number 6");
				break;
			case "7":
				System.out.println("Press number 7");
				break;
			case "8":
				System.out.println("Press number 8");
				break;
			case "9":
				System.out.println("Press number 9");
				break;
			default:
				System.out.println("Not allowed");
				break;

		}

	}
}