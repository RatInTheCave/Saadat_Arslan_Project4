package Part1_Syntax;
public class Syntax {
    public static void main(String[] args) {
       //While loop
        boolean WhileFlag = false;
        int AnswerFlag = 10;
        System.out.println("WHILE AnswerFlag does not equal zero, this loop repeats itself");
        while(!WhileFlag){
            if(AnswerFlag == 0){
                WhileFlag = true;
            }
            else{
                System.out.println(AnswerFlag);
                AnswerFlag--;
            }

        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("WHILE IntFlag does not equal ten, this loop DOES this action");
        int IntFlag = 0;
        do {
            System.out.println(IntFlag);
            IntFlag++;
        }while (IntFlag != 10);
        //Incrementing for loop
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("FOR as long as J does not equal ten, this loop repeats itself");
        for(int J = 0; J <= 10; J++){
            System.out.print(J + " ");
            }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
        //Decrementing for loop
        System.out.println("FOR as long as J does not equal zero, this loop repeats itself");
        for(int J = 10; J >= 0; J--){
            System.out.print(J +" ");
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
        String word = "ITERATION";
        System.out.println("This loop iterates through the given word, printing one character at a time");
        int WordLength = word.length();
        for(int i = 0; i < WordLength; i++){
            System.out.println(word.charAt(i));
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
        //Nested Loop
        for(int L = 0; L < 10; L++){
            System.out.println(" ");
            for(int M = 0; M < L; M++){
                System.out.print("*  ");
            }
        }
    }
}
/*
    Demonstrate while loop.
    Demonstrate do while loop.
    Demonstrate for loop.
        Print through loop, using increment (i++): 1 2 3 4 5 6 7 8 9 10
        Print through loop, using decrement (i--): 10 9 8 7 5 4 3 2 1
    Iterate through String. Print each character of the String in every new line.
    Demonstrate loop inside the loop (nested loop). For example, create for loop inside the outer for loop, make some output inside these loops. Understand the essence of such algorithm.
*/