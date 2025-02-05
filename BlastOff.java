public class BlastOff {
    public static void main(String[] args) {
        int countDown = 3;
        for(int x = 0; x < 3; x++){
            System.out.println(countDown + "\nand counting.");
            countDown = countDown - 1;
        }
        System.out.println("Blast Off!");
    }
}