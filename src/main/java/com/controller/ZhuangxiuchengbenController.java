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

import com.entity.ZhuangxiuchengbenEntity;
import com.entity.view.ZhuangxiuchengbenView;

import com.service.ZhuangxiuchengbenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 装修成本
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
@RestController
@RequestMapping("/zhuangxiuchengben")
public class ZhuangxiuchengbenController {
    @Autowired
    private ZhuangxiuchengbenService zhuangxiuchengbenService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuangxiuchengbenEntity zhuangxiuchengben,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			zhuangxiuchengben.setYuangongzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();

		PageUtils page = zhuangxiuchengbenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiuchengben), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuangxiuchengbenEntity zhuangxiuchengben, 
		HttpServletRequest request){
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();

		PageUtils page = zhuangxiuchengbenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiuchengben), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuangxiuchengbenEntity zhuangxiuchengben){
       	EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuangxiuchengben, "zhuangxiuchengben")); 
        return R.ok().put("data", zhuangxiuchengbenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuangxiuchengbenEntity zhuangxiuchengben){
        EntityWrapper< ZhuangxiuchengbenEntity> ew = new EntityWrapper< ZhuangxiuchengbenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuangxiuchengben, "zhuangxiuchengben")); 
		ZhuangxiuchengbenView zhuangxiuchengbenView =  zhuangxiuchengbenService.selectView(ew);
		return R.ok("查询装修成本成功").put("data", zhuangxiuchengbenView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuangxiuchengbenEntity zhuangxiuchengben = zhuangxiuchengbenService.selectById(id);
        return R.ok().put("data", zhuangxiuchengben);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuangxiuchengbenEntity zhuangxiuchengben = zhuangxiuchengbenService.selectById(id);
        return R.ok().put("data", zhuangxiuchengben);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuangxiuchengbenEntity zhuangxiuchengben, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhuangxiuchengben);
        zhuangxiuchengbenService.insert(zhuangxiuchengben);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuangxiuchengbenEntity zhuangxiuchengben, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhuangxiuchengben);
        zhuangxiuchengbenService.insert(zhuangxiuchengben);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhuangxiuchengbenEntity zhuangxiuchengben, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuangxiuchengben);
        zhuangxiuchengbenService.updateById(zhuangxiuchengben);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuangxiuchengbenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
            ew.eq("yuangongzhanghao", (String)request.getSession().getAttribute("username"));
		}
        List<Map<String, Object>> result = zhuangxiuchengbenService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuangong")) {
            ew.eq("yuangongzhanghao", (String)request.getSession().getAttribute("username"));
        }
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = zhuangxiuchengbenService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuangong")) {
            ew.eq("yuangongzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = zhuangxiuchengbenService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuangong")) {
            ew.eq("yuangongzhanghao", (String)request.getSession().getAttribute("username"));
        }
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = zhuangxiuchengbenService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuangong")) {
            ew.eq("yuangongzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = zhuangxiuchengbenService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,ZhuangxiuchengbenEntity zhuangxiuchengben, HttpServletRequest request){
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuangong")) {
            zhuangxiuchengben.setYuangongzhanghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<ZhuangxiuchengbenEntity> ew = new EntityWrapper<ZhuangxiuchengbenEntity>();
        int count = zhuangxiuchengbenService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiuchengben), params), params));
        return R.ok().put("data", count);
    }



}
