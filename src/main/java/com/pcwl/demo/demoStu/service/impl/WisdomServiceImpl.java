package com.pcwl.demo.demoStu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.pcwl.demo.demoStu.dao.WisdomDao;
import com.pcwl.demo.demoStu.domain.WisdomDO;
import com.pcwl.demo.demoStu.service.WisdomService;


@Service
public class WisdomServiceImpl implements WisdomService {
    @Autowired
    private WisdomDao wisdomDao;

    @Override
    public WisdomDO get(Integer id) {
        return wisdomDao.get(id);
    }

    @Override
    public List<WisdomDO> list(Map<String, Object> map) {
        return wisdomDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return wisdomDao.count(map);
    }

    @Override
    public int save(WisdomDO wisdom) {
        return wisdomDao.save(wisdom);
    }

    @Override
    public int update(WisdomDO wisdom) {
        return wisdomDao.update(wisdom);
    }

    @Override
    public int remove(Integer id) {
        return wisdomDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids) {
        return wisdomDao.batchRemove(ids);
    }

}
