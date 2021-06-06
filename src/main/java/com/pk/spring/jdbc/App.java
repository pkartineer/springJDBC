package com.pk.spring.jdbc;

import com.pk.spring.jdbc.dao.StudentDao;
import com.pk.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC Project starting..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/pk/spring/jdbc/config.xml");

        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

        int result = studentDao.insert(new Student(104,"Rajat", "Delhi"));
        System.out.println("No. of Record inserted = [" + result + "]");





    }
}
