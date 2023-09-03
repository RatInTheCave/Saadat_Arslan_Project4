package Part2_Dialog;
import java.util.Scanner;
public class Dialog {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        boolean repeatFlag = true;
        while (repeatFlag) {
            System.out.println("Please input a string. I will print it in uppercase");
            String UserString = UserInput.nextLine();
            System.out.println(UserString.toUpperCase());
            System.out.println("Do you want to try again? Please answer with Y or N");
            String answer = UserInput.nextLine();
            if (answer.toLowerCase().contains("y")) {
                repeatFlag = true;
            }
            else {
                repeatFlag = false;
            }
        }
    }
}