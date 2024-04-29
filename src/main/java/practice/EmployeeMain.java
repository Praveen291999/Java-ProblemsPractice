package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Ajith", 20, "Chennai",25000);
		Employee employee1 = new Employee(2, "Sam", 30, "Newyok",30000);
		Employee employee2 = new Employee(4, "Ram", 25, "Calcutta",15000);
		Employee employee3 = new Employee(3, "Dhoni", 31, "Spain",40000);
		Employee employee4 = new Employee(6, "Virat", 26, "Mumbai",25000);
		Employee employee5 = new Employee(5, "Vijay", 28, "Italy",35000);

		List<Employee> emp = new ArrayList<>();
		Collections.addAll(emp, employee, employee1, employee2, employee3, employee4, employee5);
		//emp.stream().forEach(a -> System.out.println(a));
		//System.out.println("***********");
		
		emp.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getAge).thenComparing(Employee::getSalary)).forEach(System.out::println);
		 //a=emp.stream().map(Employee::getId).toList();
		//Collections.binarySearch(null, null)

	}
}
