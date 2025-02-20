import java.util.Scanner;
public class NestedList {
    public static void main(String[] args) {
        double sum;
        int numberOfStudents;
        double nextScore;
        String answer;

        Scanner input = new Scanner(System.in);

        System.out.println("This program computes the average of a list of (nonnegative) exam scores.");
        do{
            System.out.println("Enter all the scores to be averaged. \nEnter a negative number after you have entered all the scores.");
            sum = 0;
            numberOfStudents = 0;
            nextScore =  input.nextDouble();
            while(nextScore >= 0){
                sum = sum + nextScore;
                numberOfStudents++;
                nextScore = input.nextDouble();
            }

            System.out.println("The average is " + sum/numberOfStudents);

            System.out.println("Want to average another exam?\nEnter yes or no?");

            answer = input.next();
        } while (answer.equalsIgnoreCase("yes"));
        input.close();
    }

}
