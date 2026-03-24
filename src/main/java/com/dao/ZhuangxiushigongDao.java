package com.dao;

import com.entity.ZhuangxiushigongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiushigongVO;
import com.entity.view.ZhuangxiushigongView;


/**
 * 装修施工
 * 
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public interface ZhuangxiushigongDao extends BaseMapper<ZhuangxiushigongEntity> {
	
	List<ZhuangxiushigongVO> selectListVO(@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);
	
	ZhuangxiushigongVO selectVO(@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);
	
	List<ZhuangxiushigongView> selectListView(@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);

	List<ZhuangxiushigongView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);

	
	ZhuangxiushigongView selectView(@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);
	

}
