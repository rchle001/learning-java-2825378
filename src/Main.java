import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Which of the following loops until a condition is not met";
        String choiceOne = "while(isTrue)";
        String choiceTwo = "While isTrue";
        String choiceThree = "continueFor(isTrue)";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println("a) " + choiceOne + "\n" + "b) " + choiceTwo + "\n" + "c) " + choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(userInput.equals("a") || userInput.equals("a)") || userInput.equals(choiceOne))
        {
            System.out.println("Congratulations!!! You are correct!");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else
        {
            System.out.println("Sorry.  The answer you gave was incoorect.  The correct answer is " + choiceOne);
        }
    }

}
