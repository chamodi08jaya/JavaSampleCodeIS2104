import java.util.*;
public class Ex6
{
public static void main(String[] args)
{
caculateValues();
}

static void caculateValues(){

int a;
Random rn=new Random();
a=1+Math.abs(rn.nextInt()%6); 
System.out.println("The result: "+a);


}

} 


 

