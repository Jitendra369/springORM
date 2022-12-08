package spring.core.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import spring.core.entity.Student;

public class StudentDAO {
	
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		Integer result = (Integer) this.hibernateTemplate.save(student);
		return result;
	}
	
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	public List<Student> getAllStudent(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	@Transactional
	public void deleteStudent(int studentID) {
		Student student = this.hibernateTemplate.get(Student.class, studentID);
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
