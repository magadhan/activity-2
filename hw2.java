import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
      int firstNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();

      System.out.println("Ready!");
      if(firstNumber > 0){
        for (i = firstNumber; i >= 0; i--) {
            System.out.println(i);
        }
      } else{
        return;
      }
      
      
      System.out.println("Start!");
      input.close();


   }
}
