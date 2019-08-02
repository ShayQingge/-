package java.com.online.college.service;


import java.util.Map;

import org.apache.log4j.Logger;

import com.online.college.common.web.SpringBeanFactory;
import com.online.college.test.dao.TestDao;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	Logger log = Logger.getLogger(AppTest.class);
	
	public void testApp() {
		TestDao testDao = (TestDao) SpringBeanFactory.getBean("testDao");
		Map<String,Object> map = testDao.testQuery();
		log.info("### curDate = " + map.get("curdate"));
	}
	
	
}