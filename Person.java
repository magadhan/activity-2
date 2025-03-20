import java.time.LocalDate;

public class Person {
    
    public String name;
    public int age;
    public String address;
    public int phone;
    public LocalDate dateOfBirth;

    public void addInfo(String name, int age, String address, int phone, LocalDate dateOfBirth){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Address is " +  address);
        System.out.println("Phone number is " + phone);
        System.out.println("Date Of Birth is " + dateOfBirth);
    }
    public void greetOthers(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I live in " + address + ".");
        System.out.println("My phone number is " + phone + ".");
        System.out.println("I was born on " + dateOfBirth);
    }
}
