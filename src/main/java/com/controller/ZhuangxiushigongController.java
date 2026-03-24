package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuangxiushigongEntity;
import com.entity.view.ZhuangxiushigongView;

import com.service.ZhuangxiushigongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 装修施工
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
@RestController
@RequestMapping("/zhuangxiushigong")
public class ZhuangxiushigongController {
    @Autowired
    private ZhuangxiushigongService zhuangxiushigongService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuangxiushigongEntity zhuangxiushigong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			zhuangxiushigong.setYuangongzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuangxiushigongEntity> ew = new EntityWrapper<ZhuangxiushigongEntity>();

		PageUtils page = zhuangxiushigongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiushigong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuangxiushigongEntity zhuangxiushigong, 
		HttpServletRequest request){
        EntityWrapper<ZhuangxiushigongEntity> ew = new EntityWrapper<ZhuangxiushigongEntity>();

		PageUtils page = zhuangxiushigongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiushigong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuangxiushigongEntity zhuangxiushigong){
       	EntityWrapper<ZhuangxiushigongEntity> ew = new EntityWrapper<ZhuangxiushigongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuangxiushigong, "zhuangxiushigong")); 
        return R.ok().put("data", zhuangxiushigongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuangxiushigongEntity zhuangxiushigong){
        EntityWrapper< ZhuangxiushigongEntity> ew = new EntityWrapper< ZhuangxiushigongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuangxiushigong, "zhuangxiushigong")); 
		ZhuangxiushigongView zhuangxiushigongView =  zhuangxiushigongService.selectView(ew);
		return R.ok("查询装修施工成功").put("data", zhuangxiushigongView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuangxiushigongEntity zhuangxiushigong = zhuangxiushigongService.selectById(id);
        return R.ok().put("data", zhuangxiushigong);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuangxiushigongEntity zhuangxiushigong = zhuangxiushigongService.selectById(id);
        return R.ok().put("data", zhuangxiushigong);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuangxiushigongEntity zhuangxiushigong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhuangxiushigong);
        zhuangxiushigongService.insert(zhuangxiushigong);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuangxiushigongEntity zhuangxiushigong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhuangxiushigong);
        zhuangxiushigongService.insert(zhuangxiushigong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhuangxiushigongEntity zhuangxiushigong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuangxiushigong);
        zhuangxiushigongService.updateById(zhuangxiushigong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuangxiushigongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
