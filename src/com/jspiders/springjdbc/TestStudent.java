package com.jspiders.springjdbc;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestStudent {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx= null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springjdbc/springconfig.xml");
		 Student std=(Student) ctx.getBean("student");
		 JdbcTemplate jdbcTemplate= (JdbcTemplate) ctx.getBean("jdbcTemplate");
		 String query = " insert into student "+
		 " values(?,?) ";
		 int res = jdbcTemplate.update(query,std.getRegno(), std.getName());
		 System.out.println("no of records inserted = " +res);
		 
		 if(ctx!=null)
		 {
			 ctx.close();
		 }

	}

}
