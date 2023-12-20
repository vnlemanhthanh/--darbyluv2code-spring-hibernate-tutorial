package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class CruddemoApplication {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudents(studentDAO);
			//readStudent(studentDAO);
			queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		int numRowsDeleted = studentDAO.deleteAll();
		logger.info("{} . Deleted all rows -> {}", studentDAO.findAll(), numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		studentDAO.delete(studentId);
		logger.info("Deleted student id -> {}", studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student student = studentDAO.findById(studentId);
		student.setFirstName("THANH");
		studentDAO.updateStudent(student);
		logger.info("Student updated -> {}", student);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		String lastName = "Doe";
		List<Student> studentList = studentDAO.findByLastName(lastName);
		logger.info("List student by lastname = " + lastName + " -> {}", studentList );
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findAll();
		logger.info("All student -> {}", studentList);
	}

	private void readStudent(StudentDAO studentDAO) {
		int id = 1;
		Student student = studentDAO.findById(id);
		logger.info("Read the student -> {}", student);
	}

	private void createStudents(StudentDAO studentDAO) {
		for (int i = 0; i < 5; i++) {
			Student student = new Student("Thanh" + i, "LE" + i, "thanh" + i + "@luv2code.com");

			studentDAO.save(student);

			logger.info("Created student with -> {}", student);
		}
	}

}
