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


import com.dao.ZhuangxiudingdanDao;
import com.entity.ZhuangxiudingdanEntity;
import com.service.ZhuangxiudingdanService;
import com.entity.vo.ZhuangxiudingdanVO;
import com.entity.view.ZhuangxiudingdanView;

@Service("zhuangxiudingdanService")
public class ZhuangxiudingdanServiceImpl extends ServiceImpl<ZhuangxiudingdanDao, ZhuangxiudingdanEntity> implements ZhuangxiudingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiudingdanEntity> page = this.selectPage(
                new Query<ZhuangxiudingdanEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiudingdanEntity> wrapper) {
		  Page<ZhuangxiudingdanView> page =new Query<ZhuangxiudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhuangxiudingdanVO> selectListVO(Wrapper<ZhuangxiudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiudingdanVO selectVO(Wrapper<ZhuangxiudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiudingdanView> selectListView(Wrapper<ZhuangxiudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiudingdanView selectView(Wrapper<ZhuangxiudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhuangxiudingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhuangxiudingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhuangxiudingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
