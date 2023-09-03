package Part3_Improved_Dialog;

import java.util.Scanner;

public class Improved_Dialog {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        boolean repeatFlag = true;
        while (repeatFlag){
            System.out.println("Please input a string. I will write it in reverse order");
            String UserString = UserInput.nextLine();
            int WordLength = UserString.length();
            for(int i = WordLength-1; i >= 0; i--){
                System.out.print(UserString.charAt(i));
            }
            System.out.println(" ");
            System.out.println("Do you want to try again? Please answer with Y or N");
            String answer = UserInput.nextLine();
            if (answer.toLowerCase().contains("y")){
                repeatFlag = true;
            } else {
                repeatFlag = false;
            }
        }
            }
        }

