package Operators;

import java.util.Scanner;

public class Cylinder {
    public static void runCylinder() {

        Scanner scanner = new Scanner(System.in);
        float pi = 3.14f;

        System.out.println("Enter the circumference of the cylinder: ");
        float circumference = scanner.nextFloat();
        System.out.println("Enter the height of the cylinder: ");
        float height = scanner.nextFloat();

        float radius = (circumference / pi) / 2;
        float totalArea = circumference * height + 2 * (pi * (radius * radius));

        float volume = pi * (radius * radius) * height;

        System.out.println("Circumference: " + (int)(circumference));
        System.out.println("Height: " + (int)(height));
        System.out.println();
        System.out.println("Sheet metal area: " + totalArea);
        System.out.println("Volume: " + volume);
    }

}
