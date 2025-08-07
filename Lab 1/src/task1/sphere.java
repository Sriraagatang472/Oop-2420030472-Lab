package task1;
import java.util.Scanner;

public class sphere{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi=3.14;
        System.out.print("Enter the radius of the sphere: ");
        double r = scanner.nextDouble();
        double volume = 4/3*pi*r*r;

        System.out.printf("The volume of the sphere is: %.2f cubic units\n", volume);
        
        scanner.close();
    }
}
