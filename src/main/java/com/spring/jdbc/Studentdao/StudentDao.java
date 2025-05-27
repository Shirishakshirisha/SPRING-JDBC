package com.spring.jdbc.Studentdao;
import com.spring.jdbc.entities.Student;
import java.util.*;

public interface StudentDao {
    // public int insert(Student student);
    //  public int change(Student student);
    //  public int delete(int studentId);
    //  public Student getStudent(int studentId);
    public List<Student> getAllStudents();


}
