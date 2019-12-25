package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Record;

public interface RecordDao {
	// 插入或更新浏览记录
	public int insertRecord(Record record);  
	// 每天访问次数top10用户
	public List<Map<String,String>> top10User(String date); 
	// 每天访问次数top10页面
	public List<Map<String,String>> top10Url(String date);

}
