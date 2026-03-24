package com.entity.model;

import com.entity.ZhuangxiudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 装修订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
public class ZhuangxiudingdanModel  implements Serializable {
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
	 * 装修时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhuangxiushijian;
		
	/**
	 * 装修时长
	 */
	
	private String zhuangxiushizhang;
		
	/**
	 * 订单金额
	 */
	
	private Double dingdanjine;
		
	/**
	 * 订单详情
	 */
	
	private String dingdanxiangqing;
		
	/**
	 * 客户信息
	 */
	
	private String kehuxinxi;
		
	/**
	 * 订单状态
	 */
	
	private String dingdanzhuangtai;
		
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
	 * 设置：装修时间
	 */
	 
	public void setZhuangxiushijian(Date zhuangxiushijian) {
		this.zhuangxiushijian = zhuangxiushijian;
	}
	
	/**
	 * 获取：装修时间
	 */
	public Date getZhuangxiushijian() {
		return zhuangxiushijian;
	}
				
	
	/**
	 * 设置：装修时长
	 */
	 
	public void setZhuangxiushizhang(String zhuangxiushizhang) {
		this.zhuangxiushizhang = zhuangxiushizhang;
	}
	
	/**
	 * 获取：装修时长
	 */
	public String getZhuangxiushizhang() {
		return zhuangxiushizhang;
	}
				
	
	/**
	 * 设置：订单金额
	 */
	 
	public void setDingdanjine(Double dingdanjine) {
		this.dingdanjine = dingdanjine;
	}
	
	/**
	 * 获取：订单金额
	 */
	public Double getDingdanjine() {
		return dingdanjine;
	}
				
	
	/**
	 * 设置：订单详情
	 */
	 
	public void setDingdanxiangqing(String dingdanxiangqing) {
		this.dingdanxiangqing = dingdanxiangqing;
	}
	
	/**
	 * 获取：订单详情
	 */
	public String getDingdanxiangqing() {
		return dingdanxiangqing;
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
	 * 设置：订单状态
	 */
	 
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
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
