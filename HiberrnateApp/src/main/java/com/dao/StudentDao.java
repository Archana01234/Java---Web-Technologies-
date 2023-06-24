package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	
	
	public static void insertStudent (Student s)
	{
		Session session=StudentUtil.creatSession();
	    Transaction transaction=session.beginTransaction();
	    session.saveOrUpdate(s);
	    transaction.commit();
	    session.close();
	}
	public static List<Student> getallstuStudents()
	{
		Session session=StudentUtil.creatSession();
		List<Student> list=session.createQuery("from Student").list();
	    session.close();
		return list;
		
	}
	public static Student getstuStudent(int id)
	{
		Session session=StudentUtil.creatSession();
        Student student=session.get(Student.class,id);
		session.close();
		return student;
		
	}
public static void deletestudent(int id)
{

	Session session=StudentUtil.creatSession();
    Transaction transaction=session.beginTransaction();
    Student student=session.get(Student.class,id);
    session.delete(student);
    transaction.commit();
    session.close();
}
}







