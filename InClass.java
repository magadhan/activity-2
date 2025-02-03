import java.util.Scanner;
public class InClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = keyboard.nextInt();

        int x = 1;
        while(x <= number){
            System.out.print(x + " ");
            x++;
        }

        keyboard.close();
    }
}
