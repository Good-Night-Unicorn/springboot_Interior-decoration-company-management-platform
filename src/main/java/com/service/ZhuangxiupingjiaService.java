package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiupingjiaView;


/**
 * 装修评价
 *
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public interface ZhuangxiupingjiaService extends IService<ZhuangxiupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiupingjiaVO> selectListVO(Wrapper<ZhuangxiupingjiaEntity> wrapper);
   	
   	ZhuangxiupingjiaVO selectVO(@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);
   	
   	List<ZhuangxiupingjiaView> selectListView(Wrapper<ZhuangxiupingjiaEntity> wrapper);
   	
   	ZhuangxiupingjiaView selectView(@Param("ew") Wrapper<ZhuangxiupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiupingjiaEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhuangxiupingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhuangxiupingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhuangxiupingjiaEntity> wrapper);



}

