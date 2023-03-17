package Labs;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        double radius;
        int length;
        double volume;
        double area;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        length = sc.nextInt();
        area = ((radius * radius) * Math.PI);
        volume = (area * length);
        System.out.format("%.1f", volume );
    }
}
