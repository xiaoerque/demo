package com.pcwl.demo.demoStu.service;

import com.pcwl.demo.demoStu.domain.StuinfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 12:54:16
 */
public interface StuinfoService {

        StuinfoDO get(Integer sid);

    List<StuinfoDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(StuinfoDO stuinfo);

    int update(StuinfoDO stuinfo);

    int remove(Integer sid);

    int batchRemove(Integer[] sids);
}
