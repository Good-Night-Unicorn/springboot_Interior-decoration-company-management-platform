package com.dao;

import com.entity.ZhuangxiudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiudingdanVO;
import com.entity.view.ZhuangxiudingdanView;


/**
 * 装修订单
 * 
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
public interface ZhuangxiudingdanDao extends BaseMapper<ZhuangxiudingdanEntity> {
	
	List<ZhuangxiudingdanVO> selectListVO(@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);
	
	ZhuangxiudingdanVO selectVO(@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);
	
	List<ZhuangxiudingdanView> selectListView(@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);

	List<ZhuangxiudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);

	
	ZhuangxiudingdanView selectView(@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);



}
