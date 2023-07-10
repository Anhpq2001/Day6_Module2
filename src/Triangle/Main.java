package Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter side 1:");
        triangle.setSide1(scanner.nextDouble());
        System.out.println("Enter side 2:");
        triangle.setSide2(scanner.nextDouble());
        System.out.println("Enter side 3:");
        triangle.setSide3(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Enter color:");
        triangle.setColor(scanner.nextLine());
        System.out.println("Result:");
        System.out.println(triangle);
    }
}
