package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.util.EmpUtil;

public class EmpDao {
	
	public static void insertEmpInfo(EmpInfo e)
	{
		Session session=EmpUtil.creatSession();
		Transaction tr=session.beginTransaction();
	    session.saveOrUpdate(e);
	    tr.commit();
	    session.close();
	}
	public static void insertEmp(Emp e)
	{
		Session session=EmpUtil.creatSession();
		Transaction tr=session.beginTransaction();
	    session.saveOrUpdate(e);
	    tr.commit();
	    session.close();
	}
	public static List<Emp> getallEmps()
	{
		Session session=EmpUtil.creatSession();
        List<Emp> list=session.createQuery("from Emp").list();
		session.close();
		return list;
		
	}
	public static Emp getEmp(int eid)
	{
		Session session=EmpUtil.creatSession();
        Emp e=session.get(Emp.class, eid);
		session.close();
		return e;
		
	}
	public static void deleteEmp(int eid)
	{
		Session session=EmpUtil.creatSession();
		Transaction tr=session.beginTransaction();
		Emp e=session.get(Emp.class, eid);
		session.delete(e);
	    tr.commit();
	    session.close();
       
	}
}









