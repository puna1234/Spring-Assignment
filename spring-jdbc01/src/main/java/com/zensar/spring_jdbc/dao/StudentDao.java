package com.zensar.spring_jdbc.dao;

import com.zensar.spring_jdbc.entity.Student;

public interface StudentDao {
public int insert(Student student);
public int change(Student student);
public int delete(int studentID);
}
