package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiushigongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiushigongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiushigongView;


/**
 * 装修施工
 *
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public interface ZhuangxiushigongService extends IService<ZhuangxiushigongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiushigongVO> selectListVO(Wrapper<ZhuangxiushigongEntity> wrapper);
   	
   	ZhuangxiushigongVO selectVO(@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);
   	
   	List<ZhuangxiushigongView> selectListView(Wrapper<ZhuangxiushigongEntity> wrapper);
   	
   	ZhuangxiushigongView selectView(@Param("ew") Wrapper<ZhuangxiushigongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiushigongEntity> wrapper);

   	

}

