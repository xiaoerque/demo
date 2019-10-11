package com.pcwl.demo.demoStu.dao;

import com.pcwl.demo.demoStu.domain.StuinfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 12:54:16
 */
@Mapper
public interface StuinfoDao {

        StuinfoDO get(Integer sid);

    List<StuinfoDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(StuinfoDO stuinfo);

    int update(StuinfoDO stuinfo);

    int remove(Integer sId);

    int batchRemove(Integer[] sids);
}
