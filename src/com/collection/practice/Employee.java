package com.collection.practice;

import java.util.Comparator;

public class Employee {
	private int id;
	private String name;
	private long phone;
	private String deg;
	private String email;
	private double salary;

	public Employee(int id, String name, long phone, String deg, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.deg = deg;
		this.email = email;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", deg=" + deg + ", email=" + email
				+ ", salary=" + salary + "]";
	}
}

class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.getId() > e2.getId())
			return 1;
		else if (e1.getId() == e2.getId())
			return 0;
		else
			return -1;
	}
}
