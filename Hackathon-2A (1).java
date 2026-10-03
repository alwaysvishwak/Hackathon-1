import java.util.Scanner;
public class RooftopSolarsystem {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print(" enter Energy generated in kwh=");
        double energy=sc.nextDouble();
        if(energy>=10) {
            System.out.println("Good energy generation");
        }else{
            System.out.println("Low energy generation");
        }
        sc.close();


    }
    
}
