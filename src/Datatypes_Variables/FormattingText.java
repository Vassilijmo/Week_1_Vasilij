package Datatypes_Variables;

public class FormattingText {
    public static void runFormattingText() {

        String text = "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it.";
        String convertedText = null;
        for (int i = 0; i < text.length(); i++) {

            if ((text.charAt(i) == '_') && (text.charAt(i+1) != '_')) {
            convertedText = String.valueOf(text.charAt(i+1));
            }
            else if ((text.charAt(i) == '#') && (text.charAt(i+1) != '#')) {
                convertedText = String.valueOf(text.charAt(i+1));

            }
        }
    }
}
