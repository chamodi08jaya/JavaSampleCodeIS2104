import java.util.Scanner;
public class cal{
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
            if(x!=0){
                int z=x%10;
                System.out.print(z);
                x=x/10;
            }
            
    }
}
public class cal1{   
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        cal c=new cal();
        
        System.out.println("Enter first number:");
        int x=s.nextInt();

        System.out.println("Enter operator +,-,*,/:");
        char op=s.next().charAt(0);

        if(op==op){
            System.out.println("Enter second number:");
            int y=s.nextInt();

            switch(op){
            
            case '+':
                c.add();
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
    
        }else{
            c.reverse(x);

        }

       
     }

}   


