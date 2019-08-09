import java.util.Scanner;
class cal{
    private int num1;
    private int num2;

    public void add(){
        System.out.println("Addition :"+ (num1+num2));
    }

     public void mul(){
        System.out.println("Multiplication :"+(num1*num2));
    }

     public void sub(){
         System.out.println("Substraction :"+(num1-num2));
    }

     public void div(){
         System.out.println("Division"+(num1/num2));
    }

    /*//getter 
    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }*/

    //setter
    public void setNum1(int num){
        this.num1=num;
    }

    public void setNum2(int num){
        this.num2=num ;
    }
}

public class Calculator{
    public static void main(String[] args){
        cal c=new cal();
        Scanner s=new Scanner(System.in);

        System.out.println("Enter first input:");
        c.setNum1(s.nextInt());

         System.out.println("Enter second input:");
        c.setNum2(s.nextInt());

         System.out.println("Enter operator + ,-,* ,/:");
        char x=s.next().charAt(0);

        if(x=='+'){
            c.add();
        }else if(x=='-'){
            c.sub();

        }else if(x=='*'){
            c.mul();
        }else if(x=='/'){
            c.div();
        }else{
             System.out.println("Wrong operator.");
        }




    }
}