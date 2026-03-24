package com.dao;

import com.entity.ZhuangxiupingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiupingjiaVO;
import com.entity.view.ZhuangxiupingjiaView;


/**
 * 装修评价
 * 
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public interface ZhuangxiupingjiaDao extends BaseMapper<ZhuangxiupingjiaEntity> {
	
	List<ZhuangxiupingjiaVO> selectListVO(@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);
	
	ZhuangxiupingjiaVO selectVO(@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);
	
	List<ZhuangxiupingjiaView> selectListView(@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);

	List<ZhuangxiupingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);

	
	ZhuangxiupingjiaView selectView(@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);



}
