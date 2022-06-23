package com.zensar.spring.boot.demo.services;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.zensar.spring.boot.dto.StudentDto;


public interface StudentService {
	
	public StudentDto getStudent(int studentId);
	public List<StudentDto> getAllStudents(int pageNumber, int pageSize, String sortBy, Direction dir);
	public StudentDto insertStudent(StudentDto student);
	public void updateStudent(int studentId, StudentDto student);
	public void deleteStudent(int studentId);
	List<StudentDto> getByStudentName(String studentName);
	List<StudentDto> findByStudentNameAndStudentAge(String studentName, int age);
	
}