import java.util.Random;
public class Exe6{
    public static void main(String[] args){
        Random r=new Random();
       // System.out.println(r.nextInt(6));
        int x=r.nextInt(6);
        System.out.println(Math.abs(x));
    }
}