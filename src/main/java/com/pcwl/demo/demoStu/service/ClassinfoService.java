package com.pcwl.demo.demoStu.service;

import com.pcwl.demo.demoStu.domain.ClassinfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-09-20 18:04:04
 */
public interface ClassinfoService {
	
	ClassinfoDO get(Integer classid);
	
	List<ClassinfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ClassinfoDO classinfo);
	
	int update(ClassinfoDO classinfo);
	
	int remove(Integer classid);
	
	int batchRemove(Integer[] classids);
}
