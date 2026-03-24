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
 * 装修成本
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 17:26:22
 */
@TableName("zhuangxiuchengben")
public class ZhuangxiuchengbenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuangxiuchengbenEntity() {
		
	}
	
	public ZhuangxiuchengbenEntity(T t) {
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
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 订单金额
	 */
					
	private Double dingdanjine;
	
	/**
	 * 材料成本
	 */
					
	private Double cailiaochengben;
	
	/**
	 * 人工成本
	 */
					
	private Double rengongchengben;
	
	/**
	 * 其他成本
	 */
					
	private Double qitachengben;
	
	/**
	 * 装修成本
	 */
					
	private Double zhuangxiuchengben;
	
	/**
	 * 所得利润
	 */
					
	private Double suodelirun;
	
	/**
	 * 装修详情
	 */
					
	private String zhuangxiuxiangqing;
	
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
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
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
	 * 设置：材料成本
	 */
	public void setCailiaochengben(Double cailiaochengben) {
		this.cailiaochengben = cailiaochengben;
	}
	/**
	 * 获取：材料成本
	 */
	public Double getCailiaochengben() {
		return cailiaochengben;
	}
	/**
	 * 设置：人工成本
	 */
	public void setRengongchengben(Double rengongchengben) {
		this.rengongchengben = rengongchengben;
	}
	/**
	 * 获取：人工成本
	 */
	public Double getRengongchengben() {
		return rengongchengben;
	}
	/**
	 * 设置：其他成本
	 */
	public void setQitachengben(Double qitachengben) {
		this.qitachengben = qitachengben;
	}
	/**
	 * 获取：其他成本
	 */
	public Double getQitachengben() {
		return qitachengben;
	}
	/**
	 * 设置：装修成本
	 */
	public void setZhuangxiuchengben(Double zhuangxiuchengben) {
		this.zhuangxiuchengben = zhuangxiuchengben;
	}
	/**
	 * 获取：装修成本
	 */
	public Double getZhuangxiuchengben() {
		return zhuangxiuchengben;
	}
	/**
	 * 设置：所得利润
	 */
	public void setSuodelirun(Double suodelirun) {
		this.suodelirun = suodelirun;
	}
	/**
	 * 获取：所得利润
	 */
	public Double getSuodelirun() {
		return suodelirun;
	}
	/**
	 * 设置：装修详情
	 */
	public void setZhuangxiuxiangqing(String zhuangxiuxiangqing) {
		this.zhuangxiuxiangqing = zhuangxiuxiangqing;
	}
	/**
	 * 获取：装修详情
	 */
	public String getZhuangxiuxiangqing() {
		return zhuangxiuxiangqing;
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
