import java.util.Scanner;

public class Ex10{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=s.nextInt();
		if(x%2==0){
			System.out.println(x+"is an Even number");
		}else{
			System.out.println(x+"is an Odd number");
		}

	}
}