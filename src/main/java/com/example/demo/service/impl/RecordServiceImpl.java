package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.GetCurrentDate;
import com.example.demo.dao.RecordDao;
import com.example.demo.entity.Record;
import com.example.demo.service.RecordService;

@Service
public class RecordServiceImpl implements RecordService{

	@Autowired
	private RecordDao recordDao;
	
	@Transactional
	@Override
	public boolean insertRecord(Record record) {
		if(record.getUrl() != null && !"".equals(record.getUrl())) {
			if(record.getuId() == null)   // 未登录匿名用户id为1
				record.setuId(1);
			record.setDate(GetCurrentDate.getCurrentDate());
			record.setFreq(1);
			try {
				int effectedNum = recordDao.insertRecord(record);
				if(effectedNum > 0) {
					return true;
				}
				else throw new RuntimeException("Fail to add new record!");
			}
			catch (Exception e) {
				throw new RuntimeException("Fail to add new record:"+e.getMessage());
			}
		}
		else throw new RuntimeException("Url can not be null!");
	}

	@Override
	public List<Map<String, String>> top10User(String date) {
		return recordDao.top10User(date);
	}

	@Override
	public List<Map<String, String>> top10Url(String date) {
		return recordDao.top10Url(date);
	}

}
