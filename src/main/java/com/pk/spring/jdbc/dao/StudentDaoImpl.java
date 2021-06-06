package com.pk.spring.jdbc.dao;

import com.pk.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements  StudentDao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        //insert query....
        String insertSql = "insert into student (id, name, city) values(?,?,?)";
        int row = this.jdbcTemplate.update(insertSql,student.getId(), student.getName(), student.getCity());
        return row;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
