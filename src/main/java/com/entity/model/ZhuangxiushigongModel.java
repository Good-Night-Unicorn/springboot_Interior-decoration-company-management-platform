package com.entity.model;

import com.entity.ZhuangxiushigongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 装修施工
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
public class ZhuangxiushigongModel  implements Serializable {
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
	 * 施工时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shigongshijian;
		
	/**
	 * 施工时长
	 */
	
	private String shigongshizhang;
		
	/**
	 * 施工详情
	 */
	
	private String shigongxiangqing;
		
	/**
	 * 客户信息
	 */
	
	private String kehuxinxi;
		
	/**
	 * 施工进度
	 */
	
	private String shigongjindu;
		
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
	 * 设置：施工时间
	 */
	 
	public void setShigongshijian(Date shigongshijian) {
		this.shigongshijian = shigongshijian;
	}
	
	/**
	 * 获取：施工时间
	 */
	public Date getShigongshijian() {
		return shigongshijian;
	}
				
	
	/**
	 * 设置：施工时长
	 */
	 
	public void setShigongshizhang(String shigongshizhang) {
		this.shigongshizhang = shigongshizhang;
	}
	
	/**
	 * 获取：施工时长
	 */
	public String getShigongshizhang() {
		return shigongshizhang;
	}
				
	
	/**
	 * 设置：施工详情
	 */
	 
	public void setShigongxiangqing(String shigongxiangqing) {
		this.shigongxiangqing = shigongxiangqing;
	}
	
	/**
	 * 获取：施工详情
	 */
	public String getShigongxiangqing() {
		return shigongxiangqing;
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
	 * 设置：施工进度
	 */
	 
	public void setShigongjindu(String shigongjindu) {
		this.shigongjindu = shigongjindu;
	}
	
	/**
	 * 获取：施工进度
	 */
	public String getShigongjindu() {
		return shigongjindu;
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
