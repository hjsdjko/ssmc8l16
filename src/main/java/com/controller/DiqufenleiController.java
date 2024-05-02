package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiqufenleiEntity;
import com.entity.view.DiqufenleiView;

import com.service.DiqufenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 地区分类
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
@RestController
@RequestMapping("/diqufenlei")
public class DiqufenleiController {
    @Autowired
    private DiqufenleiService diqufenleiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiqufenleiEntity diqufenlei, 
		HttpServletRequest request){

        EntityWrapper<DiqufenleiEntity> ew = new EntityWrapper<DiqufenleiEntity>();
		PageUtils page = diqufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diqufenlei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiqufenleiEntity diqufenlei, 
		HttpServletRequest request){
        EntityWrapper<DiqufenleiEntity> ew = new EntityWrapper<DiqufenleiEntity>();
		PageUtils page = diqufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diqufenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiqufenleiEntity diqufenlei){
       	EntityWrapper<DiqufenleiEntity> ew = new EntityWrapper<DiqufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( diqufenlei, "diqufenlei")); 
        return R.ok().put("data", diqufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiqufenleiEntity diqufenlei){
        EntityWrapper< DiqufenleiEntity> ew = new EntityWrapper< DiqufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( diqufenlei, "diqufenlei")); 
		DiqufenleiView diqufenleiView =  diqufenleiService.selectView(ew);
		return R.ok("查询地区分类成功").put("data", diqufenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiqufenleiEntity diqufenlei = diqufenleiService.selectById(id);
        return R.ok().put("data", diqufenlei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiqufenleiEntity diqufenlei = diqufenleiService.selectById(id);
        return R.ok().put("data", diqufenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiqufenleiEntity diqufenlei, HttpServletRequest request){
    	diqufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(diqufenlei);

        diqufenleiService.insert(diqufenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiqufenleiEntity diqufenlei, HttpServletRequest request){
    	diqufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(diqufenlei);

        diqufenleiService.insert(diqufenlei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiqufenleiEntity diqufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(diqufenlei);
        diqufenleiService.updateById(diqufenlei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        diqufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiqufenleiEntity> wrapper = new EntityWrapper<DiqufenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = diqufenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
