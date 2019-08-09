import java.util.Scanner;
public class CircleComputation{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius=s.nextDouble();

        double diameter=2.0*radius;
        double area=Math.PI*radius*radius;
        double circumference=2.0*Math.PI*radius;

        
        System.out.println("Diameter of the circle: "+diameter);
        System.out.println("Area of the circle:" +String.format("%.2f",area));
        System.out.println("Circumference of the circle: "+String.format("%.2f",circumference));
    }
}