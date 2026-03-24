package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiudingdanView;


/**
 * 装修订单
 *
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
public interface ZhuangxiudingdanService extends IService<ZhuangxiudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiudingdanVO> selectListVO(Wrapper<ZhuangxiudingdanEntity> wrapper);
   	
   	ZhuangxiudingdanVO selectVO(@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);
   	
   	List<ZhuangxiudingdanView> selectListView(Wrapper<ZhuangxiudingdanEntity> wrapper);
   	
   	ZhuangxiudingdanView selectView(@Param("ew") Wrapper<ZhuangxiudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiudingdanEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhuangxiudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhuangxiudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhuangxiudingdanEntity> wrapper);



}

