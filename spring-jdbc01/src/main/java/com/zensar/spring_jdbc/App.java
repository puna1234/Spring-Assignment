package com.zensar.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.spring_jdbc.dao.StudentDao;
import com.zensar.spring_jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program started.....");
		ApplicationContext context = new ClassPathXmlApplicationContext(" com/zensar/spring_jdbc/config.xml");

		StudentDao studentDao = context.getBean("studedntDao", StudentDao.class);
		Student student = new Student();
		// INSERT
		// Student student=new Student();
		// student.setId(111);
		// student.setName("Mona");
		// student.setCity("Arvi");
		// int result = studentDao.insert(student);
		// System.out.println("student added"+result);

		// UPDATE
		// Student student=new Student();
		// student.setId(222);
		// student.setName("Ram");
		// student.setCity("Wardha");
		// int result =StudentDao.change(student);
		// System.out.println("data changed"+result);

		// DELETE
		int result = studentDao.delete(111);
		System.out.println("deleted" + result);
	}
}
