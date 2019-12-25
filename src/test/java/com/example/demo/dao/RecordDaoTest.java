package com.example.demo.dao;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.GetCurrentDate;
import com.example.demo.entity.Record;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordDaoTest {
	@Autowired
	private RecordDao recordDao;
	private String today = GetCurrentDate.getCurrentDate() ;

	@Test
	public void testInsertRecord() {
		Record record = new Record();
		
		record.setuId(4);
		record.setUrl("www.baidu.com");
		record.setDate(today);
		record.setFreq(1);
		int effectedNum = recordDao.insertRecord(record);
		assertEquals(1, effectedNum);
	}

	@Test
	public void testTop10User() {
		List<Map<String,String>> userList = recordDao.top10User(today);
		assertEquals(10, userList.size());
	}

	@Test
	public void testTop10Url() {
		List<Map<String,String>> urlList = recordDao.top10Url(today);
		assertEquals(10, urlList.size());
	}

	/*
	 * @Test public void testUpdateRecord() { Record record = new Record();
	 * 
	 * record.setuId(4); record.setUrl("www.baidu.com"); record.setDate(today); int
	 * effectedNum = recordDao.updateRecord(record); assertEquals(1, effectedNum); }
	 */

}
