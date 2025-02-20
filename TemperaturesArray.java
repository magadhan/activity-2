import java.util.Scanner;

public class TemperaturesArray{
    public static void main(String[] args) {
        int num;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("How many temperatures do you have?");
        num = input.nextInt();

        System.out.println("Enter " + num + " temperatures:");

        double[] temps = new double[num];

        for (int i = 0; i < num; i++) {
            temps[i] = input.nextDouble();
            sum = sum + temps[i];
        }

        System.out.println("The average temperature is " + sum/num);

        System.out.println("The temperatures are");

        for (int i = 0; i < num; i++) {
            if(temps[i] > (sum/num)){
                System.out.println(temps[i] + " above average");
            }else if (temps[i] == (sum/num)){
                System.out.println(temps[i] + " is average");
            } else{
                System.out.println(temps[i] + " below average");
            }
        }

        input.close();
    }
}