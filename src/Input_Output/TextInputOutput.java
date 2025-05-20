package Input_Output;
import java.util.Scanner;

public class TextInputOutput {
public static void runTextInput() {
    Scanner scanText = new Scanner(System.in);
    System.out.println("Please enter yourname: ");
    String name = scanText.nextLine();
    System.out.println("Hello " + name + ", Welcome to the training!");
}
}
