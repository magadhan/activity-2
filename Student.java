
import java.time.LocalDate;

public class Student extends Person{
    public int iD;
    public double gpa;

    public Student(String name, int iD, LocalDate dateOfBirth, double gpa){
        this.name = name;
        this.iD = iD;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public String toString(){
        return ;
    }

}
