import java.util.Scanner;
public class AverageWithInputValidation{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double tot=0;
        boolean isvalid=false;
        int x;
        
        int i=1;
           do{
                
                while(i<=3){
                
                    System.out.println("Enter the mark (0-100) for student "+i);
                    x=s.nextInt();
                    if(0<=x && x<=100){
                        i++;
                        tot=tot+x;
                     }else {
                        System.out.println("Invalid input, try again...");
                     } 
                    
                    
                }
                double avg=tot/3;
                System.out.println("The average is:"+String.format("%.2f",avg));
                break; 
             
            }while(!isvalid);
            
    }
}

 