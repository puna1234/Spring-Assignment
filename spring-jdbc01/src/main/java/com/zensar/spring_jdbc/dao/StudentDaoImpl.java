package com.zensar.spring_jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.spring_jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao{
private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		
		// Insert query
		String query="insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		// updating data
		String query="update student set name=? , city=? , where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentID) {
		// delete operation
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentID);
		return r;
	
	
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	}
	
	

	
	




