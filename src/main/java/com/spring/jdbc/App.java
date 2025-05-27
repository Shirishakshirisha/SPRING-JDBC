package com.spring.jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Studentdao.StudentDao;
import com.spring.jdbc.entities.Student;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        ApplicationContext context  = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        // JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        // String query = "insert into student(id, name, city) values(?, ?, ?)";
        // int result = jdbcTemplate.update(query, 101, "John Doe", "New York");
        // System.out.println("Number of rows affected: " + result);

        // Ensure StudentDao class exists and is imported correctly
        StudentDao studentdao = context.getBean("studentDao", StudentDao.class);



        // Student student = new Student();
        // student.setId(103);
        // student.setName("Srushti");    
        // student.setCity("Karnataka");
        // int result = studentdao.insert(student);
        // System.out.println("Number of rows affected: " + result);
        

        // Uncomment the following lines to test the change method
        // Student student = new Student();
        // student.setId(102); // Ensure this ID exists in your database
        // student.setName("Apple");
        // int changeResult = studentdao.change(student);
        // System.out.println("Number of rows changed: " + changeResult);


        // Uncomment the following lines to test the delete method
        // int studentIdToDelete = 102; // Ensure this ID exists in your database
        // int deleteResult = studentdao.delete(studentIdToDelete);
        // System.out.println("Number of rows deleted: " + deleteResult);


        // Uncomment the following lines to test the getStudent method
        // int studentIdToGet = 101; // Ensure this ID exists in your database
        // Student student = studentdao.getStudent(studentIdToGet);
        // if (student != null) {
        //     System.out.println("Student Details: " + student);
        // } else {
        //     System.out.println("No student found with ID: " + studentIdToGet);
        // }


        // Example usage of getStudent method
        // int studentIdToGet = 101; // Ensure this ID exists in your database
        // Student student = studentdao.getStudent(studentIdToGet);
        // if (student != null) {
        //     System.out.println("Student Details: " + student);
        // } else {
        //     System.out.println("No student found with ID: " + studentIdToGet);
        // }

        // Example usage of getAllStudents method
        System.out.println("Fetching all students...");
        List<Student> students = studentdao.getAllStudents();
        if (students != null && !students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("No students found.");
        }



        

    }
}
