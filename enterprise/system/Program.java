package system;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        java.util.List<Employee> employees = new java.util.ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the remaining newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            // You can store the employee object in a list or perform other operations as
            // needed

            employees.add(employee);

        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee employee = employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
        if (employee != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp : employees) {
            System.out.println(emp.getId() + ", " + emp.getName() + ", " + String.format("%.2f", emp.getSalary()));
        }

        sc.close();
    }
}