package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Record;

public interface RecordService {
	// 插入或更新浏览记录
	public boolean insertRecord(Record record);  
	// 每天访问次数top10用户
	public List<Map<String,String>> top10User(String date); 
	// 每天访问次数top10页面
	public List<Map<String,String>> top10Url(String date);
}
