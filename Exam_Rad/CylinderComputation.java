import java.util.Scanner;
public class CylinderComputation{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius :");
        double radius=s.nextDouble();

        System.out.println("Enter height :");
        double height=s.nextDouble();

        
        double basearea=Math.PI*radius*radius;
        double surfaceArea=2.0*Math.PI*radius+2.0*basearea;
        double volume=basearea*height;

        
        System.out.println("BaseArea: "+String.format("%.2f",basearea));
        System.out.println("Area :" +String.format("%.2f",surfaceArea));
        System.out.println("Volume: "+String.format("%.2f",volume));
    }
} 