package com.entity.view;

import com.entity.ZhuangxiushigongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 装修施工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
@TableName("zhuangxiushigong")
public class ZhuangxiushigongView  extends ZhuangxiushigongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangxiushigongView(){
	}
 
 	public ZhuangxiushigongView(ZhuangxiushigongEntity zhuangxiushigongEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangxiushigongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
