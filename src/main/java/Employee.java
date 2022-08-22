import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {

    String name;
    String surname;
    int salary;


    public String toString() {
        return "Salary for " + name + " " + surname + " is " + salary;
    }
}


