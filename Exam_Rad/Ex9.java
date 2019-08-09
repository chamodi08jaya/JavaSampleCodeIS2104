import java.util.Scanner;
public class Ex9{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age in years:");
		int x=s.nextInt();
		if(x>=18){
			System.out.println("Eligible to Vote");
		}else{
			System.out.println("Not Eligible to Vote");
		}

	}
}