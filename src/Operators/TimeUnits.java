package Operators;

import java.util.Scanner;

public class TimeUnits {
    public static void runTimeUnits() {
        Scanner secondsScanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter number of seconds: ");
        int inputSeconds = secondsScanner.nextInt();

        int seconds = inputSeconds % 60;
        int minutes = (inputSeconds / 60) % 60;
        int hours = ((inputSeconds / 60) / 60) % 24;
        int days = (((inputSeconds / 60) / 60) / 24) % 365;
        int years = (((inputSeconds / 60) / 60) / 24) / 365;

        System.out.println();
        System.out.println(
                        years + " years and " +
                        days + " days and " +
                        hours + " hours and " +
                        minutes + " minutes and " +
                        seconds + " seconds"
        );
    }
}
