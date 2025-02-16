public class PrimitiveExample {
    public static void modifyPrimitive(int val) {
        val += 10;
        System.out.println("Inside modifyPrimitive: " + val);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before modifyPrimitive: " + num);
        modifyPrimitive(num);
        System.out.println("After modifyPrimitive: " + num);
    }

}   
