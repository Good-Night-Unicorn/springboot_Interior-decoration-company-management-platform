package com.entity.view;

import com.entity.ZhuangxiupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 装修评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
@TableName("zhuangxiupingjia")
public class ZhuangxiupingjiaView  extends ZhuangxiupingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangxiupingjiaView(){
	}
 
 	public ZhuangxiupingjiaView(ZhuangxiupingjiaEntity zhuangxiupingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangxiupingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
