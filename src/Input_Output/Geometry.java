package Input_Output;

import java.util.Scanner;

public class Geometry {
    public static void runGeometry() {

        Scanner scanNumber = new Scanner(System.in);
        double area;
        double perimeter;
        boolean inputValid = false;
        String choice = null;
        System.out.println("Geometrie!");
        System.out.println("Bitte wähle <1> für Rechteck und <2> für Dreieck!");



        while (!inputValid) {

            choice = scanNumber.nextLine();

            System.out.print("Deine Wahl: ");

            if (choice.equals("1")) {
                System.out.println("Rechteck");
                inputValid = true;
            }
            else if (choice.equals("2")) {
                System.out.println("Dreieck");
                inputValid = true;
            }
            else {
                System.out.println(choice);

                System.out.println("Ungültige Eingabe");
                System.out.println("Neuer Versuch!");
                System.out.println("Bitte wähle <1> für Rechteck und <2> für Dreieck!");
            }

        }



        System.out.print("Gib Seite <a> an: ");
        int a = scanNumber.nextInt();
        System.out.print("Gib Seite <b> an:");
        int b = scanNumber.nextInt();

        if (choice.equals("1")) {
            area = a * b;
            perimeter = a + b;
            System.out.println("Die Fläche beträgt: " + (int) (area));
            System.out.println("Der Umfang beträgt: " + (int) (perimeter));
        }
        else if (choice.equals("2")) {
            area = 0.5 * a * b;
            double c = Math.sqrt((a*a) + (b*b));
            perimeter = a + b + c;
            System.out.printf("Die Fläche beträgt: %.1f", area);
            System.out.println();
            System.out.printf("Der Umfang beträgt: %.1f", perimeter);
        }

    }
}
