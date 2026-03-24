package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuangxiupingjiaDao;
import com.entity.ZhuangxiupingjiaEntity;
import com.service.ZhuangxiupingjiaService;
import com.entity.vo.ZhuangxiupingjiaVO;
import com.entity.view.ZhuangxiupingjiaView;

@Service("zhuangxiupingjiaService")
public class ZhuangxiupingjiaServiceImpl extends ServiceImpl<ZhuangxiupingjiaDao, ZhuangxiupingjiaEntity> implements ZhuangxiupingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiupingjiaEntity> page = this.selectPage(
                new Query<ZhuangxiupingjiaEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiupingjiaEntity> wrapper) {
		  Page<ZhuangxiupingjiaView> page =new Query<ZhuangxiupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhuangxiupingjiaVO> selectListVO(Wrapper<ZhuangxiupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiupingjiaVO selectVO(Wrapper<ZhuangxiupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiupingjiaView> selectListView(Wrapper<ZhuangxiupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiupingjiaView selectView(Wrapper<ZhuangxiupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhuangxiupingjiaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhuangxiupingjiaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhuangxiupingjiaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
