package module1;
import java.util.Scanner;
public class Employee {
	int empId;
    String empName;
    double salary;

   
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    
    void displayEmployee() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Employee 1:");
        Employee e1 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

        System.out.println("Enter details for Employee 2:");
        Employee e2 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

        e1.displayEmployee();
        e2.displayEmployee();

	}

}
