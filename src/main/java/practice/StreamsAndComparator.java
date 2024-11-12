package practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.sql.rowset.spi.SyncFactory;

class Employee1 {
	private int id;
	private String name;
	private String address;
	private LocalDateTime joiningDate;

	public Employee1(int id, String name, String address,LocalDateTime joiningDate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.joiningDate=joiningDate;
	}
	
	public Employee1(String name, String address) {
		
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address=" + address + ", joiningDate=" + joiningDate +"]";
	}

}

class Department {
	private int Employee1Id;
	private String departmentName;

	public Department(int Employee1Id, String departmentName) {
		this.Employee1Id = Employee1Id;
		this.departmentName = departmentName;
	}

	public int getEmployee1Id() {
		return Employee1Id;
	}

	public String getDepartmentName() {
		return departmentName;
	}
}

public class StreamsAndComparator {
	public static void main(String[] args) {
		
		 LocalDateTime joiningDate = LocalDateTime.of(2024, 9, 10, 5, 55, 39, 825_000_007);
		 LocalDateTime joiningDate1 = LocalDateTime.of(2024, 9, 10, 5, 55, 39, 825_000_000);
		 LocalDateTime joiningDate2 = LocalDateTime.of(2024, 9, 10, 5, 55, 39, 720_000_000);
		 
		List<Employee1> employees = new ArrayList<>();
		employees.add(new Employee1(1, "John","Chennai",joiningDate));
		employees.add(new Employee1(2, "Alice","Mumbai",joiningDate1));
		employees.add(new Employee1(3, "Bob","Coimbatore",joiningDate2));

		List<Department> departments = new ArrayList<>();
		departments.add(new Department(1, "IT"));
		departments.add(new Department(2, "HR"));
		departments.add(new Department(4, "Finance"));

		List<String> result = employees.stream()
				.filter(e->departments.stream().anyMatch(d -> d.getEmployee1Id() == e.getId())).map(e->e.getName()+" "+e.getAddress()).toList();
		result.forEach(System.out::println);
		
		//Ascending Order
		List<Employee1> sortedList=employees.stream().sorted(Comparator.comparing(Employee1::getJoiningDate)).toList();
		
		System.out.println("****Ascending Order****");
		sortedList.forEach(System.out::println);
		
		//Descinding Order
		List<Employee1> sortedList1=employees.stream().sorted(Comparator.comparing(Employee1::getJoiningDate).reversed()).toList();
		System.out.println("****Descending Order****");
		
		sortedList1.forEach(System.out::println);
		
		
		
		

		
		
	}
}
