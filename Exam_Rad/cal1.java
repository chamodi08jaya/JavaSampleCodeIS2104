import java.util.Scanner;

 class cal{
     void add(int x,int y){
        System.out.println("Addition : "+(x+y));
        
    }
    
     void sub(int x,int y){
        System.out.println("Substraction : "+(x-y));
    }

     void mul(int x,int y){
        System.out.println("Multiplication : "+(x*y));
    }

     void div(int x,int y){
        System.out.println("Division : "+(x/y));
    }

     void reverse(int x){
            while(x!=0){
                int z=x%10;
                System.out.print(z);
                x=x/10;
            }
            System.out.println("\n");
            
    }
}
public class cal1{   
    public static void main(String[] args){
         boolean ISVALID;
        ISVALID=true;
        Scanner s=new Scanner(System.in);
        cal c=new cal();
        
        while(ISVALID){
            System.out.println("Enter first number:");
            int x=s.nextInt();

            System.out.println("Enter operator +,-,*,/,r:");
            char op=s.next().charAt(0);

            if(op=='+' ||op=='-' || op=='*' || op=='/'){
                System.out.println("Enter second number:");
                int y=s.nextInt();

                switch(op){
                    case '+':
                        c.add(x,y);
                        break;
                    case '-':
                        c.sub(x,y);
                        break;
                    case '*':
                        c.mul(x,y);
                        break;
                    case '/':
                        c.div(x,y);
                        break;
                    default:
                        System.out.println("Wrong operator");

                 }
                
    
            }else if(op=='r'){
                 c.reverse(x);
                
            }else{
                System.out.println("Wrong operator");
             }

             System.out.println("whether want you to Continue, say true if not say false:");
            ISVALID=s.nextBoolean();  
             

        }
        
     }

}   


