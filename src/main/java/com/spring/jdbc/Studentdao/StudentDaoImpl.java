package com.spring.jdbc.Studentdao;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.Studentdao.RowMapperImpl;

public class StudentDaoImpl implements StudentDao
    {
        private JdbcTemplate jdbcTemplate;
        public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        @Override
        public List<Student> getAllStudents() {
            String query = "select * from student";
            List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
            return students;
        }


    // @Override
    // public int insert(Student student) {
       
    //     String query = "insert into student(id, name, city)values(?, ?, ?)";
    //     int r=this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    //     return r;
    // }

    // @Override
    // public int change(Student student) {
    //     String query = "update student set name=?, city=? where id=?";
    //     int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
    //     return r;
    // }

    // @Override
    // public int delete(int studentId) {
    //     String query = "delete from student where id=?";
    //     int r = this.jdbcTemplate.update(query, studentId);
    //     return r;
    // }

    // @Override
    // public Student getStudent(int studentId) {
    //     String query = "select * from student where id=?";
    //     Student student = this.jdbcTemplate.queryForObject(query, new org.springframework.jdbc.core.RowMapper<Student>() {
    //         @Override
    //         public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    //             Student s = new Student();
    //             s.setId(rs.getInt("id"));
    //             s.setName(rs.getString("name"));
    //             s.setCity(rs.getString("city"));
    //             return s;
    //         }
    //     }, studentId);
    //     return student;
    // }

    // @Override
    // public Student getStudent(int id)
    // {
    //     String query = "select * from student where id=?";
    //     RowMapper<Student> rowMapper = new RowMapperImpl();
    //     Student student = this.jdbcTemplate.queryForObject(query,rowMapper, id); 
    //     return student;
    // }
        
    }


