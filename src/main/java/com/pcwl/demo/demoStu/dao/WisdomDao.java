package com.pcwl.demo.demoStu.dao;

import com.pcwl.demo.demoStu.domain.WisdomDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 15:08:20
 */
@Mapper
public interface WisdomDao {

        WisdomDO get(Integer id);

    List<WisdomDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(WisdomDO wisdom);

    int update(WisdomDO wisdom);

    int remove(Integer id);

    int batchRemove(Integer[] ids);
}
