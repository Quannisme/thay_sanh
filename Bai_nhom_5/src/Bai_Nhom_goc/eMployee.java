package Bai_Nhom_goc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BaiNhom.Employee;

public class eMployee {
private int id;
private String name;
private double salary;
			public eMployee(int id, String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
	}
			public void Increase_salary(double amount)
	{
		this.salary+=amount;
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
class EmployeeManagerr{
	List<eMployee> employee=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void enterInfor()
	{
		System.out.println("Nhap id cua nhan vien:");
		int n=sc.nextInt();
		System.out.println("Nhap ten cua nhan vien:");
		String e=sc.nextLine();
		System.out.println("Nhap luong cua nhan vien :");
		double l=sc.nextDouble();
	}
public void increaseAllSalary(double amount)
	{
					for(eMployee i:employee)
		{
			i.Increase_salary(amount);
		}
	}
public void displayEmplyee()
	{
		for(eMployee i:employee)
		{
			System.out.println(i.toString());
		}
	}
public void displayInforEmployee(eMployee i)
	{
					for(eMployee e:employee)
		{
			if(i.equals(e.getId()))
			{
				System.out.println(e.toString());
						}
		}
	}
}
