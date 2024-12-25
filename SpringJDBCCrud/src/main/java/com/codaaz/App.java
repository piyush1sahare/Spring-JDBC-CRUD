package com.codaaz;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.codaaz.beann.Students;
import com.codaaz.mapps.StudMapper;
import com.codaaz.resources.SpringConfig;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    
    	
    			
    	
        ApplicationContext ap = new AnnotationConfigApplicationContext(SpringConfig.class);
      JdbcTemplate jt=   ap.getBean(JdbcTemplate.class);
//      
    	
    	// for the insert values
//-------------------------------------------------for the insert----------------------------------------------------------------
//      String name= "Virat";
//  	String email="Kohli@gmail.com";
//  	String passwords="0018";
//      
//      String sql= "insert into student value(?,?,?)"; 
//   int count=   jt.update(sql, name,email,passwords);  
//        
//      if(count>0) {
//    	  System.out.println("data inserted Successfully");
//      }
//      else {
//    	  System.out.println("not valid anything");
//      }
// -------------------------------------------------for update--------------------------------------------------------------------   	
    
    	
    	// for update opration
      
//    	String email="virat@gmail.com";
//    	String sql="update student SET email=? where passwords=0000";
//    	
//    int count =	jt.update(sql,email);
//    
//    if(count>0) {
//  	  System.out.println("data inserted Successfully");
//    }
//    else {
//  	  System.out.println("not valid anything");
//    }
    
//------------------------------------------------for deletion ----------------------------------------------------------
      
      // for deletion 
//      String name="virat";
//      String sql="delete from student where name=?";
//    int count=  jt.update(sql,name);
//    if(count>0) {
//	  System.out.println("data inserted Successfully");
//  }
//  else {
//	  System.out.println("not valid anything");
//  }
    
      
//------------------------------------------------for select ----------------------------------------------------------
      //  query
      
      
//      String sql= "select * from student";
//    List<Students>  std_list= jt.query(sql, new StudMapper());
//      
//    
//      for(Students std: std_list) {
//    	  System.out.println("name: " +std.getName());
//    	  System.out.println("email: " +std.getEmail());
//    	  System.out.println("password: " +std.getPasswords());
//    	  System.out.println("-----------------------------------------------------------------------------------------");
//      }
//      
      
      String sql= "select * from student where name='Virat'";
      List<Students>  std_list= jt.query(sql, new StudMapper());
        
      
        for(Students std: std_list) {
      	  System.out.println("name: " +std.getName());
      	  System.out.println("email: " +std.getEmail());
      	  System.out.println("password: " +std.getPasswords());
      	  System.out.println("-----------------------------------------------------------------------------------------");
        }
      
      
      
      
      
      
      
      
      
    }
}
