package com.zensar.springdemo;

public class Department {
	
	private String departmentName;
	private int departmentId;
	public Department() {
		super();
	}
	public Department(String departmentName, int departmentId) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId + "]";
	}
	
	

}