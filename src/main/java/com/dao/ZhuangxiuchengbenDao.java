package com.dao;

import com.entity.ZhuangxiuchengbenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiuchengbenVO;
import com.entity.view.ZhuangxiuchengbenView;


/**
 * 装修成本
 * 
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public interface ZhuangxiuchengbenDao extends BaseMapper<ZhuangxiuchengbenEntity> {
	
	List<ZhuangxiuchengbenVO> selectListVO(@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);
	
	ZhuangxiuchengbenVO selectVO(@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);
	
	List<ZhuangxiuchengbenView> selectListView(@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);

	List<ZhuangxiuchengbenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);

	
	ZhuangxiuchengbenView selectView(@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);



}
