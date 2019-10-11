package com.pcwl.demo.demoStu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcwl.demo.demoStu.domain.StuinfoDO;
import com.pcwl.demo.demoStu.service.StuinfoService;
import com.pcwl.demo.common.utils.PageUtils;
import com.pcwl.demo.common.utils.Query;
import com.pcwl.demo.common.utils.R;

/**
 * 
 *
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 12:54:16
 */

@Controller
@RequestMapping("/demoStu/stuinfo")
public class StuinfoController {
    @Autowired
    private StuinfoService stuinfoService;

    @GetMapping()
    String Stuinfo() {
        return "demoStu/stuinfo/stuinfo";
    }

    @ResponseBody
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<StuinfoDO> stuinfoList = stuinfoService.list(query);
        int total = stuinfoService.count(query);
        PageUtils pageUtils = new PageUtils(stuinfoList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    String add() {
        return "demoStu/stuinfo/add";
    }

    @GetMapping("/edit/{sid}")
    String edit(@PathVariable("sid") Integer sid, Model model) {
            StuinfoDO stuinfo = stuinfoService.get(sid);
        model.addAttribute("stuinfo", stuinfo);
        return "demoStu/stuinfo/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    public R save( StuinfoDO stuinfo) {
        if (stuinfoService.save(stuinfo) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    public R update( StuinfoDO stuinfo) {
            stuinfoService.update(stuinfo);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    public R remove( Integer sid) {
        if (stuinfoService.remove(sid) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    public R remove(@RequestParam("ids[]") Integer[] sids) {
            stuinfoService.batchRemove(sids);
        return R.ok();
    }

}
