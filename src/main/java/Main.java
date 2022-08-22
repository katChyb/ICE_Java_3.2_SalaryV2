import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Provide name for employee " + (i + 1));
            String name = scanner.next();

            System.out.println("Provide surname for employee " + (i + 1));
            String surname = scanner.next();

            System.out.println("Provide salary for employee " + (i + 1));
            int salary = Helpers.getNumberFromUser();

            Company.employeeList.add(new Employee(name, surname, salary));
        }
        System.out.println("Adding employee successful, total employee in list: " + Company.employeeList.size());
        System.out.println(" ");

        int action = 0;
        while (action != 4) {
            System.out.println("Select your action:");
            System.out.println("1 - Print sum of all employees salary");
            System.out.println("2 - Display all employees data");
            System.out.println("3 - Add new employee");
            System.out.println("4 - End program");

            action = Helpers.getNumberFromUser();
            switch (action) {
                case 1:
                    Helpers.printSalarySum(Company.employeeList);
                    break;
                case 2:
                    Helpers.printAllData(Company.employeeList);
                    break;
                case 3:
                    Helpers.addEmploye(Company.employeeList);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Unfortunately, you selected an option out of range (1-4), your option is: " + action);
            }
        }

    }

}





