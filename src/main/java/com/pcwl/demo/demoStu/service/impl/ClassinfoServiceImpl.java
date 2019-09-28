package com.pcwl.demo.demoStu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.pcwl.demo.demoStu.dao.ClassinfoDao;
import com.pcwl.demo.demoStu.domain.ClassinfoDO;
import com.pcwl.demo.demoStu.service.ClassinfoService;


@Service
public class ClassinfoServiceImpl implements ClassinfoService {
    @Autowired
    private ClassinfoDao classinfoDao;

    @Override
    public ClassinfoDO get(Integer classid) {
        return classinfoDao.get(classid);
    }

    @Override
    public List<ClassinfoDO> list(Map<String, Object> map) {
        return classinfoDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return classinfoDao.count(map);
    }

    @Override
    public int save(ClassinfoDO classinfo) {
        return classinfoDao.save(classinfo);
    }

    @Override
    public int update(ClassinfoDO classinfo) {
        return classinfoDao.update(classinfo);
    }

    @Override
    public int remove(Integer classid) {
        return classinfoDao.remove(classid);
    }

    @Override
    public int batchRemove(Integer[] classids) {
        return classinfoDao.batchRemove(classids);
    }

}
