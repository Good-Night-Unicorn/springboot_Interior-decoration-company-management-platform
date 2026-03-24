package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiuchengbenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiuchengbenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiuchengbenView;


/**
 * 装修成本
 *
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public interface ZhuangxiuchengbenService extends IService<ZhuangxiuchengbenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiuchengbenVO> selectListVO(Wrapper<ZhuangxiuchengbenEntity> wrapper);
   	
   	ZhuangxiuchengbenVO selectVO(@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);
   	
   	List<ZhuangxiuchengbenView> selectListView(Wrapper<ZhuangxiuchengbenEntity> wrapper);
   	
   	ZhuangxiuchengbenView selectView(@Param("ew") Wrapper<ZhuangxiuchengbenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiuchengbenEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhuangxiuchengbenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhuangxiuchengbenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhuangxiuchengbenEntity> wrapper);



}

