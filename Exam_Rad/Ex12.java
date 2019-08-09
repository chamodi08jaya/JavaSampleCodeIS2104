import java.util.Scanner;
public class Ex12{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Unit price:");
		float x=s.nextFloat();
		System.out.println("Quantity:");
		int y=s.nextInt();
		float total=x*y;
		System.out.println("Revenue:"+total);
		if(100<=y && y<=120){
			total=total-(total*10/100);
		}else if(y>120){
			total=total-(total*15/100);
		}else{
			total=total;
		}
		System.out.println("After dicount"+total);
	}
}