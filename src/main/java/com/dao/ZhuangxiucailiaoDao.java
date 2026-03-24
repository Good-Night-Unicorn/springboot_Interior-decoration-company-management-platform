package com.dao;

import com.entity.ZhuangxiucailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiucailiaoVO;
import com.entity.view.ZhuangxiucailiaoView;


/**
 * 装修材料
 * 
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
public interface ZhuangxiucailiaoDao extends BaseMapper<ZhuangxiucailiaoEntity> {
	
	List<ZhuangxiucailiaoVO> selectListVO(@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);
	
	ZhuangxiucailiaoVO selectVO(@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);
	
	List<ZhuangxiucailiaoView> selectListView(@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);

	List<ZhuangxiucailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);

	
	ZhuangxiucailiaoView selectView(@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);
	

}
