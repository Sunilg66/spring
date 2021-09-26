package com.xworkz.vaccine.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterDAOImpl implements RegisterDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public RegisterDAOImpl() {
		super();
		System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}

	@Override
	public boolean saveRegisterDTO(Object entity) {
		
		Session session=null;
		
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("entity saved");
			return true;
		}catch(HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("session closed");
			}else {
				System.out.println("session not closed");
			}
		}
		return false;
	}

	

}
