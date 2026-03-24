package com.entity.view;

import com.entity.CailiaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 材料分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
@TableName("cailiaofenlei")
public class CailiaofenleiView  extends CailiaofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CailiaofenleiView(){
	}
 
 	public CailiaofenleiView(CailiaofenleiEntity cailiaofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, cailiaofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
