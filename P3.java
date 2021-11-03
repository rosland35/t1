import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side lengths of the triangle: ");
        double b = input.nextDouble();
        double a = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        double u = (a + b + c) / 2;

        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("area is: " + area);
    }
}
