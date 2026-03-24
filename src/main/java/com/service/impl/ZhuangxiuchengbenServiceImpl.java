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


import com.dao.ZhuangxiuchengbenDao;
import com.entity.ZhuangxiuchengbenEntity;
import com.service.ZhuangxiuchengbenService;
import com.entity.vo.ZhuangxiuchengbenVO;
import com.entity.view.ZhuangxiuchengbenView;

@Service("zhuangxiuchengbenService")
public class ZhuangxiuchengbenServiceImpl extends ServiceImpl<ZhuangxiuchengbenDao, ZhuangxiuchengbenEntity> implements ZhuangxiuchengbenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiuchengbenEntity> page = this.selectPage(
                new Query<ZhuangxiuchengbenEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiuchengbenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiuchengbenEntity> wrapper) {
		  Page<ZhuangxiuchengbenView> page =new Query<ZhuangxiuchengbenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhuangxiuchengbenVO> selectListVO(Wrapper<ZhuangxiuchengbenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiuchengbenVO selectVO(Wrapper<ZhuangxiuchengbenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiuchengbenView> selectListView(Wrapper<ZhuangxiuchengbenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiuchengbenView selectView(Wrapper<ZhuangxiuchengbenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhuangxiuchengbenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhuangxiuchengbenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhuangxiuchengbenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
