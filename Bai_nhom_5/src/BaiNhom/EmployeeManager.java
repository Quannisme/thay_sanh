package BaiNhom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bai_Nhom_goc.eMployee;

public class EmployeeManager {
	List<eMployee> employee = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void enterInfor() {
		System.out.println("Nhap id cua nhan vien:");
		int id = sc.nextInt();
		System.out.println("Nhap ten cua nhan vien:");
		String name = sc.nextLine();
		System.out.println("Nhap luong cua nhan vien :");
		double salary = sc.nextDouble();
	}

	public void increaseAllSalary(double amount) {
		for (eMployee i : employee) {
			i.Increase_salary(amount);
		}
	}

	public void displayEmplyee() {
		for (eMployee i : employee) {
			System.out.println(i.toString());
		}
	}

	public void displayInforEmployee(eMployee i) {
		for (eMployee e : employee) {
			if (i.equals(e.getId())) {
				System.out.println(e.toString());
			}
		}
	}
}
