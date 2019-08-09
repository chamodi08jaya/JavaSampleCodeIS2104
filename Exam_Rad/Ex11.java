import java.util.Scanner;
public class Ex11{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Quiz score:");
		float y=s.nextFloat();
		System.out.println("Mid-term score:");
		float x=s.nextFloat();
		System.out.println("Final score:");
		float z=s.nextFloat();
		float average;
		average=(x+y+z)/3;
		if(average>=90){
			System.out.println("A");
		}else if(average>=70){
			System.out.println("B");	
		}else if(average>=50){
			System.out.println("C");
		}else{
			System.out.println("F");
		}
		
	}

}