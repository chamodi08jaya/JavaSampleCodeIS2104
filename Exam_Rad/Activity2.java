import java.util.Scanner;
public class Activity2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total mass of the shuttle:");
        float mass=s.nextFloat();
        float weight=mass*9.8f;
        System.out.println("Enter Thrust generate by one booster:");
         float boost=s.nextFloat();
        System.out.println("Enter thrust of Shuttle:");
         float shuttle=s.nextFloat();
         float total=2*boost+shuttle;
         float force=total-weight;
         float acceleration=force/mass;
        System.out.println(acceleration);

        }
}