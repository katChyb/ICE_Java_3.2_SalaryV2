import java.util.List;
import java.util.Scanner;

public class Helpers {


    public static void printAllData(List<Employee> employeeList) {
        System.out.println("Data of all employee in list:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + employeeList.get(i));
        }
        System.out.println("Total employee in list: " + employeeList.size());
        System.out.println(" ");
    }

    public static void printSalarySum(List<Employee> employeeList) {
        int money = 0;
        for (Employee e : employeeList) {
            money = money + e.getSalary();
        }
        System.out.println("The sum of the salary of all employees is: " + money);
        System.out.println(" ");
    }

    public static void addEmploye(List<Employee> employeeList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide data for new employee ");
        System.out.println("Provide name for employee ");
        String name = scanner.next();

        System.out.println("Provide surname for employee ");
        String surname = scanner.next();

        System.out.println("Provide salary for employee ");
        int salary = getNumberFromUser();

        employeeList.add(new Employee(name, surname, salary));
        System.out.println("Adding employee successful, total employee in list: " + employeeList.size());
        System.out.println(" ");
    }

    public static int getNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

}
