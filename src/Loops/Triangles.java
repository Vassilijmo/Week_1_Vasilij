package Loops;

import java.util.Scanner;

public class Triangles {
    public static void runTriangles() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How large should the triangles be?");
        int sizeTriangels = scanner.nextInt();
        System.out.println("How many triangles would you like?");
        int numberOfTriangles = scanner.nextInt();

        for (int i = 0; i < numberOfTriangles; i++) {

            for (int j = 1; j <= sizeTriangels; j++) {
               String star = "";

               for (int k = 1; k <= j; k++) {
                   star += "*";

               }
                System.out.println(star);
            }
            System.out.println("neu");
        }
    }
}
