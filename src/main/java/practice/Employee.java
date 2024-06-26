package practice;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;
	private String city;
	private Integer salary;

	public Employee(Integer id, String name, Integer age, String city, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}
}
