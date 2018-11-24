package org.springframework.test.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @Description :
 * @Date ： 2018/11/24 12:17
 */
@Test
public class BeanLoadTest {
	@Test
	public void testLoad() {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(
				"application-common.xml", "application-beans.xml", "application-jdbc.xml");
		Object member = app.getBean("member");
	}
}
