package top.latfat.blogback;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import top.latfat.blogback.entity.User;

/**
 * 
 * @author sean
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class TestUser {
	
	@Autowired
	private SessionFactory factory;
	private Session session;

	@Before
	public void init(){
		try {
			session = factory.getCurrentSession();
		} catch (Exception e) {
			session = factory.openSession();
			System.out.println(e.getMessage());
		}
	}
	
	
	@Test
	public void testSession() {
		System.out.println(session);
	}
	
	@Test
	public void testSave() {
		User user = new User("asdasd", "Ð£»¨");
		java.io.Serializable id = session.save(user);
		System.out.println(id);
	}
	
	@Test
	public void testFind() {
		User user = (User) session.get(User.class, "asdasd");
		System.out.println(user);
	}
	
	@After
	public void destory() {
		session.close();
	}
}
