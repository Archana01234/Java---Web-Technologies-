package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Dept;
import com.bean.Emp;
import com.util.EmpUtil;

public class EmpDao {
	
	public static void insertDept(Dept d)
	{
		Session session=EmpUtil.creatSession();
		Transaction transaction=session.beginTransaction();
		session.save(d);
		transaction.commit();
		session.close();
	}
	public static List<Dept>getallDepts()
	{
		Session session=EmpUtil.creatSession();
         List<Dept> list=session.createQuery("from Dept").list();
		session.close();
         return list;
		
	}
   public static void insertEmp(Emp e)
{
	Session session=EmpUtil.creatSession();
	Transaction transaction=session.beginTransaction();
	session.save(e);
	transaction.commit();
	session.close();	
}
public static Dept getDept(int did)
{
	Session session=EmpUtil.creatSession();
	Dept d=session.get(Dept.class, did);
	session.close();
	return d;
	
}
}


