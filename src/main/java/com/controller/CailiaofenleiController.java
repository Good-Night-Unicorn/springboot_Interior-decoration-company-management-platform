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

import com.entity.CailiaofenleiEntity;
import com.entity.view.CailiaofenleiView;

import com.service.CailiaofenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 材料分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
@RestController
@RequestMapping("/cailiaofenlei")
public class CailiaofenleiController {
    @Autowired
    private CailiaofenleiService cailiaofenleiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CailiaofenleiEntity cailiaofenlei,
		HttpServletRequest request){
        EntityWrapper<CailiaofenleiEntity> ew = new EntityWrapper<CailiaofenleiEntity>();

		PageUtils page = cailiaofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaofenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CailiaofenleiEntity cailiaofenlei, 
		HttpServletRequest request){
        EntityWrapper<CailiaofenleiEntity> ew = new EntityWrapper<CailiaofenleiEntity>();

		PageUtils page = cailiaofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaofenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CailiaofenleiEntity cailiaofenlei){
       	EntityWrapper<CailiaofenleiEntity> ew = new EntityWrapper<CailiaofenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cailiaofenlei, "cailiaofenlei")); 
        return R.ok().put("data", cailiaofenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CailiaofenleiEntity cailiaofenlei){
        EntityWrapper< CailiaofenleiEntity> ew = new EntityWrapper< CailiaofenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cailiaofenlei, "cailiaofenlei")); 
		CailiaofenleiView cailiaofenleiView =  cailiaofenleiService.selectView(ew);
		return R.ok("查询材料分类成功").put("data", cailiaofenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CailiaofenleiEntity cailiaofenlei = cailiaofenleiService.selectById(id);
        return R.ok().put("data", cailiaofenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CailiaofenleiEntity cailiaofenlei = cailiaofenleiService.selectById(id);
        return R.ok().put("data", cailiaofenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CailiaofenleiEntity cailiaofenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(cailiaofenlei);
        cailiaofenleiService.insert(cailiaofenlei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CailiaofenleiEntity cailiaofenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(cailiaofenlei);
        cailiaofenleiService.insert(cailiaofenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CailiaofenleiEntity cailiaofenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cailiaofenlei);
        cailiaofenleiService.updateById(cailiaofenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cailiaofenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
