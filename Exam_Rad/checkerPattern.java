import java.util.Scanner;
public class checkerPattern{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int i=s.nextInt();

        int row=0;
        while(row<i){
            if(row%2==0){
                System.out.println("# # # # # # # ");
            }else{
                System.out.println("    # # # # # # #");
            }
            row++;

        }
    }
}