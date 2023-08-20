import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the values of x triangle: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        //-----------------------------------------------------------------
        System.out.println("Enter the values of y triangle: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("X Triangle area: " + areaX);
        System.out.println("Y Triangle area: " + areaY);
        System.out.println((areaX > areaY) ? "Larger area: X" : "Larger area: Y");
        sc.close();
    }
}
