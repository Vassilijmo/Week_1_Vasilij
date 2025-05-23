import Datatypes_Variables.DataTypes;
import Input_Output.FormattingTextOutput;
import Input_Output.Geometry;
import Input_Output.TextInputOutput;
import Loops.ChristmasTree;
import Loops.GuessingNumbers;
import Loops.Triangles;
import Operators.Cylinder;
import Operators.OneLineOfCode;
import Operators.TimeUnits;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Exercises Prestudies Week 1");
        System.out.println("Vasilij Moroz");

        while (isRunning) {

            int count = 0;
            if (count > 0) {
                System.out.println("Willst du weitere Übungen sehen?");

            }
            System.out.println("Wähle eines der Themen aus:");
            System.out.println("1 für Input & Output");
            System.out.println("2 für Datatypes & Variables");
            System.out.println("3 für Operators");
            System.out.println("4 für Loops");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: ///Input & Output
                    System.out.println("Wähle eines der Aufgaben aus:");
                    System.out.println("1 für die Aufgabe >Text input and output<");
                    System.out.println("2 für die Aufgabe >Formatting text outpu<");
                    System.out.println("3 für die Aufgabe >Geometry<");
                    int choice1 = scanner.nextInt();

                    switch (choice1) {
                        case 1: //Input & Output
                            TextInputOutput.runTextInput();
                            break;
                        case 2:
                            FormattingTextOutput.printAscii();
                            break;
                        case 3:
                            Geometry.runGeometry();
                            break;
                        default:
                            System.out.println("Diese Aufgabe ist nicht vorhanden!");
                            break;
                    }
                    break;
                case 2: //Datatypes & Variables
                    System.out.println("Wähle eines der Aufgaben aus:");
                    System.out.println("1 für die Aufgabe >Data types<");

                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            DataTypes.runDataTypes();
                            break;

                        default:
                            System.out.println("Diese Aufgabe ist nicht vorhanden!");
                            break;
                    }
                    break;
                case 3: //Operators
                    System.out.println("Wähle eines der Aufgaben aus:");
                    System.out.println("1 für die Aufgabe >Time units<");
                    System.out.println("2 für die Aufgabe >Cylinder<");
                    System.out.println("3 für die Aufgabe >One line of code<");
                    int choice3 = scanner.nextInt();
                    switch (choice3) {
                        case 1:
                            TimeUnits.runTimeUnits();
                            break;
                        case 2:
                            Cylinder.runCylinder();
                            break;
                        case 3:
                            OneLineOfCode.runOneLineOfCode();
                            break;
                        default:
                            System.out.println("Diese Aufgabe ist nicht vorhanden!");
                            break;
                    }
                    break;
                case 4: //Loops
                    System.out.println("Wähle eines der Aufgaben aus:");
                    System.out.println("1 für die Aufgabe >Guessing numbers<");
                    System.out.println("2 für die Aufgabe >Triangles<");
                    System.out.println("3 für die Aufgabe >ChristmasTree<");
                    int choice4 = scanner.nextInt();
                    switch (choice4) {
                        case 1:
                            GuessingNumbers.runGuessingNumbers();
                            break;
                        case 2:
                            Triangles.runTriangles();
                            break;
                        case 3:
                            ChristmasTree.runChristmasTree();
                            break;
                        default:
                            System.out.println("Diese Aufgabe ist nicht vorhanden!");
                            break;

                    }
                    break;
                default:
                    System.out.println("Dieses Thema ist nicht vorhanden!");
                    break;


            }
        }

    }
}