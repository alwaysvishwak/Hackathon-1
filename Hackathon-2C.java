import java.util.Scanner;

public class TotalEnergy {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Morning energy= ");
        double morning = sc.nextDouble();
        System.out.print("Evening energy= ");
        double evening = sc.nextDouble();
        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total energy =" + total);

        sc.close();
    }
}
