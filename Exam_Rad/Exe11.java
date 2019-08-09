import java.util.Scanner;
public class Exe11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter quiz mark:");
        float quiz=s.nextFloat();

        System.out.println("Enter mid-term mark:");
        float mid=s.nextFloat();

        System.out.println("Enter finall mark:");
        float finall=s.nextFloat();

        float avg=(quiz+mid+finall)/3;

        if(avg>=90){
            System.out.println("grade A");
        }else if(avg>=70) {
            System.out.println("grade B");
        }else if(avg>=50) {
            System.out.println("grade C");
        }else{
            System.out.println("grade F");
        }
    }
} 