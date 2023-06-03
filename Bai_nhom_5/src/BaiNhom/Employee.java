package BaiNhom;

public class Employee {
	// Nguyen Van Quan : Refactor rename , chinh format code ;
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void Increase_salary(double amount) {
		this.salary += amount;
	}

	@Override
	public String toString() {
		return "eMployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
