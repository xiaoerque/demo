package com.pcwl.demo.demoStu.controller;

import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcwl.demo.demoStu.domain.ClassinfoDO;
import com.pcwl.demo.demoStu.service.ClassinfoService;
import com.pcwl.demo.common.utils.PageUtils;
import com.pcwl.demo.common.utils.Query;
import com.pcwl.demo.common.utils.R;

/**
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-09-20 18:04:04
 */

@Controller
@RequestMapping("/demoStu/classinfo")
public class ClassinfoController {
    @Autowired
    private ClassinfoService classinfoService;

    @GetMapping()
        //@RequiresPermissions("demoStu:classinfo:classinfo")
    String Classinfo() {
        return "demoStu/classinfo/classinfo";
    }

    @ResponseBody
    @GetMapping("/list")
    //@RequiresPermissions("demoStu:classinfo:classinfo")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<ClassinfoDO> classinfoList = classinfoService.list(query);
        int total = classinfoService.count(query);
        PageUtils pageUtils = new PageUtils(classinfoList, total);
        return pageUtils;
    }

    @GetMapping("/add")
        //@RequiresPermissions("demoStu:classinfo:add")
    String add() {
        return "demoStu/classinfo/add";
    }

    @GetMapping("/edit/{classid}")
        //@RequiresPermissions("demoStu:classinfo:edit")
    String edit(@PathVariable("classid") Integer classid, Model model) {
        ClassinfoDO classinfo = classinfoService.get(classid);
        model.addAttribute("classinfo", classinfo);
        return "demoStu/classinfo/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    //@RequiresPermissions("demoStu:classinfo:add")
    public R save(ClassinfoDO classinfo) {
        if (classinfoService.save(classinfo) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    //@RequiresPermissions("demoStu:classinfo:edit")
    public R update(ClassinfoDO classinfo) {
        classinfoService.update(classinfo);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    //@RequiresPermissions("demoStu:classinfo:remove")
    public R remove(Integer classid) {
        if (classinfoService.remove(classid) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    //@RequiresPermissions("demoStu:classinfo:batchRemove")
    public R remove(@RequestParam("ids[]") Integer[] classids) {
        classinfoService.batchRemove(classids);
        return R.ok();
    }

}
