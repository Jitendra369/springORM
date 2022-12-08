package spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.dao.StudentDAO;
import spring.core.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
    	StudentDAO stuDAO = context.getBean("studentDAO", StudentDAO.class);
    	Student student = new Student();
//    	student.setStudentID(1);
    	student.setStudentName("Pooja Kadu");
    	student.setStudentAddress("Wardha");
    	
    	int insert = stuDAO.insert(student);
    	System.out.println(insert);
    }
}
