import java.util.Scanner;
public class Exx3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks:");
		int x=s.nextInt();
		if(x>=50){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		System.out.println("DONE");
		
	}
}