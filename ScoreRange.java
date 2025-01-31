import java.util.Scanner;
public class ScoreRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numeric score between 0 to 100.");
        int score = input.nextInt();
        if ((score >= 0) && (score < 60)){
            System.out.print("Grade: F");
        }else if((score >= 60) && (score < 70)){
            System.out.print("Grade: D");
        }else if((score >= 70) && (score < 80)){
            System.out.print("Grade: C");
        }else if((score >= 80) && (score < 90)){
            System.out.print("Grade: B");
        }else{
            System.out.print("Grade: A");
        }
        input.close();

    }
    

}
