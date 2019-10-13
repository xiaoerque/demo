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

import com.pcwl.demo.demoStu.domain.WisdomDO;
import com.pcwl.demo.demoStu.service.WisdomService;
import com.pcwl.demo.common.utils.PageUtils;
import com.pcwl.demo.common.utils.Query;
import com.pcwl.demo.common.utils.R;

/**
 * 
 *
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 15:08:20
 */

@Controller
@RequestMapping("/demoStu/wisdom")
public class WisdomController {
    @Autowired
    private WisdomService wisdomService;

    @GetMapping()
    String Wisdom() {
        return "demoStu/wisdom/wisdom";
    }

    @ResponseBody
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<WisdomDO> wisdomList = wisdomService.list(query);
        int total = wisdomService.count(query);
        PageUtils pageUtils = new PageUtils(wisdomList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    String add() {
        return "demoStu/wisdom/add";
    }

    @GetMapping("/edit/{id}")
    String edit(@PathVariable("id") Integer id, Model model) {
            WisdomDO wisdom = wisdomService.get(id);
        model.addAttribute("wisdom", wisdom);
        return "demoStu/wisdom/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    public R save( WisdomDO wisdom) {
        if (wisdomService.save(wisdom) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    public R update( WisdomDO wisdom) {
            wisdomService.update(wisdom);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    public R remove( Integer id) {
        if (wisdomService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    public R remove(@RequestParam("ids[]") Integer[] ids) {
            wisdomService.batchRemove(ids);
        return R.ok();
    }

}
