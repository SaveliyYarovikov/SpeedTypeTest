import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static final String helloMessage = "Select mode:\n1. Type full text\n2. Type in one minute";
    public static void main(String[] args) {
        String text = Text.text;
        Scanner scanner = new Scanner(System.in);
        System.out.println(helloMessage);
        int mode;
        String line;

        while (true){
            line = scanner.nextLine();
            try {
                mode = Integer.parseInt(line);
            }catch (NumberFormatException e){
                System.out.println("Use numbers to select speed test mode!");
                System.out.println(helloMessage);
                continue;
            }
            if (mode == 1 || mode == 2){
                TypingTest test = new TypingTest(text, mode);
                test.startTest();
                break;
            }
            System.out.println("Input one of suggested variants!");
            System.out.println(helloMessage);
        }
    }
}
