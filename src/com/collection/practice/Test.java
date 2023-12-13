package com.collection.practice;

import java.util.*;
import java.util.Scanner;

public class Test {
	static Scanner s = new Scanner(System.in);
	static List<Employee> emp = new ArrayList<Employee>();

	public static void main(String[] args) {
		int choic;
		do {
			System.out.println("1.Save Employee");
			System.out.println("2.Display Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Sort Employee");
			System.out.println("5.Delete Employee");
			choic = s.nextInt();
			switch (choic) {
			case 1: {
				saveEmployee();
				break;
			}
			case 2: {
				dispalyEmp();
				break;
			}
			case 3: {
				updateEmployee();
				break;
			}
			case 4: {
				sortEmployee();
				break;
			}
			case 5: {
				deleteEmployee();
				break;
			}
			}
		} while (choic != 0);
	}

	public static void saveEmployee() {
		System.out.print("Enter Empno : ");
		int id = s.nextInt();
		System.out.print("Enter EmpName : ");
		String name = s.next();
		System.out.print("Enter EmpPhoneNo : ");
		long pno = s.nextLong();
		System.out.print("Enter Deg : ");
		String dg = s.next();
		System.out.print("Enter EmpEmail : ");
		String eml = s.next();
		System.out.print("Enter EmpSalary : ");
		double sal = s.nextDouble();
		emp.add(new Employee(id, name, pno, dg, eml, sal));
		System.out.println("Employee Saved with id : " + id);
	}

	public static void dispalyEmp() {
		System.out.println(".......................................");
		ListIterator<Employee> i = emp.listIterator();
		while (i.hasNext()) {
			Employee e = i.next();
			System.out.println(e);
		}
		System.out.println(".......................................");
	}

	public static void updateEmployee() {
		boolean found = false;
		System.out.print("Enter Employee id to Update : ");
		int id = s.nextInt();
		ListIterator<Employee> i = emp.listIterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (e.getId() == id) {
				System.out.print("Enter the new Name : ");
				String name = s.next();
				System.out.print("Enter EmpPhoneNo : ");
				long pno = s.nextLong();
				System.out.print("Enter Deg : ");
				String dg = s.next();
				System.out.print("Enter EmpEmail : ");
				String eml = s.next();
				System.out.print("Enter EmpSalary : ");
				double sal = s.nextDouble();
				i.set(new Employee(id, name, pno, dg, eml, sal));
				found = true;
			}
		}
		if (!found) {
			System.err.println("Invalid Employee Id");
		} else {
			System.out.println("Employee Update Sucessfully");
		}
	}

	public static void sortEmployee() {
		Collections.sort(emp, new MyComparator());
		for (Employee e : emp) {
			System.out.println(e);
		}
	}

	public static void deleteEmployee() {
		boolean found = false;
		System.out.println("Enter Employee id to Delete the Record");
		int id = s.nextInt();
		ListIterator<Employee> i = emp.listIterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (e.getId() == id) {
				i.remove();
				found = true;
			}
		}
		if (!found) {
			System.err.println("Invalid Employee Id");
		} else {
			System.out.println("Employee Deleted Sucessfully");
		}
	}
}
