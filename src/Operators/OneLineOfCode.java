package Operators;

public class OneLineOfCode {
    public static void runOneLineOfCode() {

        double x = 15.5;
        double a = Math.sqrt(3.5 + x);
        double b = a * 5;
        double c = b / 3;
        double d = x + 10;
        double e = x - 4.1;
        double f = d * e;
        double g = c - f;

        System.out.println();
        System.out.println("Original: " + g);
        System.out.print("In einer Linie: ");
        System.out.println((((Math.sqrt(3.5 + 15.5)) * 5) / 3) - (15.5 - 4.1) * (15.5 + 10));

    }
}
