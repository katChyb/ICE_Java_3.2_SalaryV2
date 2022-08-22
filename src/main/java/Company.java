import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Company {

    Employee employee;
    static List<Employee> employeeList = new ArrayList<>();
}

