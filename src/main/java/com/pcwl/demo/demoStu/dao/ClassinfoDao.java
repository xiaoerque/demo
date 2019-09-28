package com.pcwl.demo.demoStu.dao;

import com.pcwl.demo.demoStu.domain.ClassinfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-09-20 18:04:04
 */
@Mapper
public interface ClassinfoDao {

    ClassinfoDO get(Integer classid);

    List<ClassinfoDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ClassinfoDO classinfo);

    int update(ClassinfoDO classinfo);

    int remove(Integer classId);

    int batchRemove(Integer[] classids);
}
