package com.zensar.spring.boot.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
@Id
	private int studentId;
	private String studentName;
	private int studentAge;

	public StudentDto() {
		super();
	}

	public StudentDto(int studentId, String studentName, int studentAge) {
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
		return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}

}