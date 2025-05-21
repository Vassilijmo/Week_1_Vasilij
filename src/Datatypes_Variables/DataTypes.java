package Datatypes_Variables;

public class DataTypes {

    public static void runDataTypes(){

        String myInitials = "V.M.";
        int germanyPopulation = 83280000;
        long earthPopulation = 8062000000L;
        boolean isDaytime = true;
        float goalStrikeQuote = 0.65f;
        byte javaProgramWeeks = 14;
        double pi = 3.141592654;

        System.out.println();
        System.out.printf("%-30s %-30s %-30s\n", "Name", "Value", "Datatype");
        System.out.println();
        System.out.printf("%-30s %-30s %-30s\n", "Initialen", myInitials, "String");
        System.out.printf("%-30s %-30d %-30s\n", "Population in Deutschland", germanyPopulation, "int");
        System.out.printf("%-30s %-30d %-30s\n", "Population auf der Erde", earthPopulation, "long");
        System.out.printf("%-30s %-30b %-30s\n", "Tageszeit", isDaytime, "boolean");
        System.out.printf("%-30s %-30.2f %-30s\n", "Torquote", goalStrikeQuote, "float");
        System.out.printf("%-30s %-30d %-30s\n", "Dauer Java_Programms", javaProgramWeeks, "byte");
        System.out.printf("%-30s %-30.15f %-30s\n", "Pi", pi, "double");


    }
}
