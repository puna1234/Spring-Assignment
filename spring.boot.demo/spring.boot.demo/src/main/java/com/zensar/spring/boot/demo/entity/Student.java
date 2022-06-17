package com.zensar.spring.boot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "Student.test", query = "from Students where s. studentName=?1")
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private int studentAge;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

}
