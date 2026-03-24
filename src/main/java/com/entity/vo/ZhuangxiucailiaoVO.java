package com.entity.vo;

import com.entity.ZhuangxiucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 装修材料
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
public class ZhuangxiucailiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料分类
	 */
	
	private String cailiaofenlei;
		
	/**
	 * 材料照片
	 */
	
	private String cailiaozhaopian;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 价格
	 */
	
	private Double jiage;
		
	/**
	 * 库存
	 */
	
	private Integer kucun;
		
	/**
	 * 材料详情
	 */
	
	private String cailiaoxiangqing;
				
	
	/**
	 * 设置：材料分类
	 */
	 
	public void setCailiaofenlei(String cailiaofenlei) {
		this.cailiaofenlei = cailiaofenlei;
	}
	
	/**
	 * 获取：材料分类
	 */
	public String getCailiaofenlei() {
		return cailiaofenlei;
	}
				
	
	/**
	 * 设置：材料照片
	 */
	 
	public void setCailiaozhaopian(String cailiaozhaopian) {
		this.cailiaozhaopian = cailiaozhaopian;
	}
	
	/**
	 * 获取：材料照片
	 */
	public String getCailiaozhaopian() {
		return cailiaozhaopian;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getKucun() {
		return kucun;
	}
				
	
	/**
	 * 设置：材料详情
	 */
	 
	public void setCailiaoxiangqing(String cailiaoxiangqing) {
		this.cailiaoxiangqing = cailiaoxiangqing;
	}
	
	/**
	 * 获取：材料详情
	 */
	public String getCailiaoxiangqing() {
		return cailiaoxiangqing;
	}
			
}
