package com.entity.vo;

import com.entity.ZhuangxiupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 装修评价
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public class ZhuangxiupingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 装修标题
	 */
	
	private String zhuangxiubiaoti;
		
	/**
	 * 装修要求
	 */
	
	private String zhuangxiuyaoqiu;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
	/**
	 * 评价状态
	 */
	
	private String pingjiazhuangtai;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 客户信息
	 */
	
	private String kehuxinxi;
		
	/**
	 * 员工账号
	 */
	
	private String yuangongzhanghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：装修标题
	 */
	 
	public void setZhuangxiubiaoti(String zhuangxiubiaoti) {
		this.zhuangxiubiaoti = zhuangxiubiaoti;
	}
	
	/**
	 * 获取：装修标题
	 */
	public String getZhuangxiubiaoti() {
		return zhuangxiubiaoti;
	}
				
	
	/**
	 * 设置：装修要求
	 */
	 
	public void setZhuangxiuyaoqiu(String zhuangxiuyaoqiu) {
		this.zhuangxiuyaoqiu = zhuangxiuyaoqiu;
	}
	
	/**
	 * 获取：装修要求
	 */
	public String getZhuangxiuyaoqiu() {
		return zhuangxiuyaoqiu;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
	}
				
	
	/**
	 * 设置：评价状态
	 */
	 
	public void setPingjiazhuangtai(String pingjiazhuangtai) {
		this.pingjiazhuangtai = pingjiazhuangtai;
	}
	
	/**
	 * 获取：评价状态
	 */
	public String getPingjiazhuangtai() {
		return pingjiazhuangtai;
	}
				
	
	/**
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
				
	
	/**
	 * 设置：客户信息
	 */
	 
	public void setKehuxinxi(String kehuxinxi) {
		this.kehuxinxi = kehuxinxi;
	}
	
	/**
	 * 获取：客户信息
	 */
	public String getKehuxinxi() {
		return kehuxinxi;
	}
				
	
	/**
	 * 设置：员工账号
	 */
	 
	public void setYuangongzhanghao(String yuangongzhanghao) {
		this.yuangongzhanghao = yuangongzhanghao;
	}
	
	/**
	 * 获取：员工账号
	 */
	public String getYuangongzhanghao() {
		return yuangongzhanghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
