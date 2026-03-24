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
 * 装修材料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 17:26:21
 */
@TableName("zhuangxiucailiao")
public class ZhuangxiucailiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuangxiucailiaoEntity() {
		
	}
	
	public ZhuangxiucailiaoEntity(T t) {
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
	 * 材料名称
	 */
					
	private String cailiaomingcheng;
	
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
	 * 设置：材料名称
	 */
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
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
