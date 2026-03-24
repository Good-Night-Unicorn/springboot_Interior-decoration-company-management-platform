package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 装修施工
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
@TableName("zhuangxiushigong")
public class ZhuangxiushigongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuangxiushigongEntity() {
		
	}
	
	public ZhuangxiushigongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
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
