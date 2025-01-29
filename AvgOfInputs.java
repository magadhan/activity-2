import java.util.Scanner;
    
// Fill in the required Import Method for using Scanner.
public class AvgOfInputs {
    public static void main(String[] args) {
        //Declare the Required variables.
        double input1;
        double input2;
        double input3;
        double avgInput;
        // Create a Scanner Object.
        Scanner input = new Scanner(System.in);
        //Instruct the user to enter the first Input.
        System.out.print("Enter input1: ");
        //Read the input from user keyboard.
        input1 = input.nextDouble();
        //Repeat the steps to read other inputs.
        System.out.print("Enter input2: ");
        input2 = input.nextDouble();
        System.out.print("Enter input3: ");
        input3 = input.nextDouble();
        //Calculate the average & print it out.
        avgInput = Math.round((input1 + input2 + input3)/3);
        System.out.printf("The average of the inputs is %.1f.", avgInput);
        //Close the Scanner.
        input.close();
    }
}


