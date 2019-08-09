import java.util.Scanner;
public class ExtraDigits{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a nummber:");
		int x=s.nextInt();
		int y;
		while(x>0){
			y=x%10;
			System.out.println(y);
			x=x/10;

		}
	}
}