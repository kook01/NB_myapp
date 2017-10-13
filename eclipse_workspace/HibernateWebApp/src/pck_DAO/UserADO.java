package pck_DAO;

import org.hibernate.*;
import org.hibernate.cfg.*;

import pck_bean.*;

public class UserADO {
	
	public void AddUser(String userName,String password,String email,String phone,String city) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session session = sfac.openSession();
		try {
			Transaction tx = session.beginTransaction();
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user.setEmail(email);
			user.setPhone(phone);
			user.setCity(city);
			tx.commit();
			System.out.println("\n\n Detail Added \n");
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}finally {
			session.close();
			sfac.close();
		}
	}
	
}
