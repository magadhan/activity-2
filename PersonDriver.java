public class PersonDriver {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.addInfo("Athu", 45, "56 Strat Road, Levittown", 756383948);
        person1.displayInfo();
        person1.greetOthers();

        person2.addInfo("Levi", 18, "20 Namman Street, Queens", 747383320);
        person2.displayInfo();
        person2.greetOthers();
    }
    
}
