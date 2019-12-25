package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GetCurrentDate;
import com.example.demo.entity.Record;
import com.example.demo.service.RecordService;

@RestController
@RequestMapping("/user")
public class RecordController {

	@Autowired
	private RecordService recordService;
	
	@RequestMapping(value="/visit", method = RequestMethod.POST)
	private Map<String, Object> visit(@RequestBody Record record){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", recordService.insertRecord(record));
		return modelMap;
	}
	
	@RequestMapping(value="/userrank", method = RequestMethod.GET)
	private Map<String, Object> userRank(){
		String date = GetCurrentDate.getCurrentDate() ;
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Map<String, String>> list = recordService.top10User(date);
		modelMap.put("top 10 User", list);
		return modelMap;
	}
	
	@RequestMapping(value="/urlrank", method = RequestMethod.GET)
	private Map<String, Object> urlRank(){
		String date = GetCurrentDate.getCurrentDate() ;
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Map<String, String>> list = recordService.top10Url(date);
		modelMap.put("top 10 Url", list);
		return modelMap;
	}
	
}
