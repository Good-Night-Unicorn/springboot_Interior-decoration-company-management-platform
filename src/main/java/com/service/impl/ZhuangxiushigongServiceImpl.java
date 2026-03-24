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


import com.dao.ZhuangxiushigongDao;
import com.entity.ZhuangxiushigongEntity;
import com.service.ZhuangxiushigongService;
import com.entity.vo.ZhuangxiushigongVO;
import com.entity.view.ZhuangxiushigongView;

@Service("zhuangxiushigongService")
public class ZhuangxiushigongServiceImpl extends ServiceImpl<ZhuangxiushigongDao, ZhuangxiushigongEntity> implements ZhuangxiushigongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiushigongEntity> page = this.selectPage(
                new Query<ZhuangxiushigongEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiushigongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiushigongEntity> wrapper) {
		  Page<ZhuangxiushigongView> page =new Query<ZhuangxiushigongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhuangxiushigongVO> selectListVO(Wrapper<ZhuangxiushigongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiushigongVO selectVO(Wrapper<ZhuangxiushigongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiushigongView> selectListView(Wrapper<ZhuangxiushigongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiushigongView selectView(Wrapper<ZhuangxiushigongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
