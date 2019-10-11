package com.pcwl.demo.demoStu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.pcwl.demo.demoStu.dao.StuinfoDao;
import com.pcwl.demo.demoStu.domain.StuinfoDO;
import com.pcwl.demo.demoStu.service.StuinfoService;


@Service
public class StuinfoServiceImpl implements StuinfoService {
    @Autowired
    private StuinfoDao stuinfoDao;

    @Override
    public StuinfoDO get(Integer sid) {
        return stuinfoDao.get(sid);
    }

    @Override
    public List<StuinfoDO> list(Map<String, Object> map) {
        return stuinfoDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return stuinfoDao.count(map);
    }

    @Override
    public int save(StuinfoDO stuinfo) {
        return stuinfoDao.save(stuinfo);
    }

    @Override
    public int update(StuinfoDO stuinfo) {
        return stuinfoDao.update(stuinfo);
    }

    @Override
    public int remove(Integer sid) {
        return stuinfoDao.remove(sid);
    }

    @Override
    public int batchRemove(Integer[] sids) {
        return stuinfoDao.batchRemove(sids);
    }

}
