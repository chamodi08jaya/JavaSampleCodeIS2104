import java.util.Scanner;
public class Exe12{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter unit price:");
        float unit=s.nextFloat();

        System.out.println("Enter quantity:");
        float quantity=s.nextFloat();

        float total=unit*quantity;
        float discount,revenue;
        if(quantity<100){
            discount=total*0f;
            revenue=total-discount;
        }else if(quantity<=120) {
           discount=total* 0.10f;
            revenue=total-discount;
        }else{
           discount=total* 0.15f;
            revenue=total-discount;
        }
        System.out.println("The revenue from sale:"+ revenue);
        System.out.println("After discount:"+discount);
        
        
    }
} 