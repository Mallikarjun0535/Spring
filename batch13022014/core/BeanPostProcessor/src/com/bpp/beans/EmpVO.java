package com.bpp.beans;

public class EmpVO extends AbstractBaseVO {
	private int id;
	private String name;
	private float salary;
	private String email;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmpVO [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", email=" + email + ", lastModifiedDt=" + lastModifiedDt
				+ "]";
	}

}
