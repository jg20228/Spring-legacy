package com.wc.legacy2;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)

//DB 연결 테스트
public class DataSourceTest {
	
	@Inject
	private DataSource ds;
	
    // DB연결
	@Test
	public void testCon() throws Exception{
		try (Connection con = ds.getConnection()) {
			System.out.println("연결정보 : "+con);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
