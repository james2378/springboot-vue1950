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
 * 楼盘管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("loupanguanli")
public class LoupanguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoupanguanliEntity() {
		
	}
	
	public LoupanguanliEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 楼房名称
	 */
					
	private String loufangmingcheng;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 出租楼房
	 */
					
	private Integer chuzuloufang;
	
	/**
	 * 已售楼房
	 */
					
	private Integer yishouloufang;
	
	/**
	 * 剩余楼房
	 */
					
	private Integer shengyuloufang;
	
	
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
	 * 设置：楼房名称
	 */
	public void setLoufangmingcheng(String loufangmingcheng) {
		this.loufangmingcheng = loufangmingcheng;
	}
	/**
	 * 获取：楼房名称
	 */
	public String getLoufangmingcheng() {
		return loufangmingcheng;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：出租楼房
	 */
	public void setChuzuloufang(Integer chuzuloufang) {
		this.chuzuloufang = chuzuloufang;
	}
	/**
	 * 获取：出租楼房
	 */
	public Integer getChuzuloufang() {
		return chuzuloufang;
	}
	/**
	 * 设置：已售楼房
	 */
	public void setYishouloufang(Integer yishouloufang) {
		this.yishouloufang = yishouloufang;
	}
	/**
	 * 获取：已售楼房
	 */
	public Integer getYishouloufang() {
		return yishouloufang;
	}
	/**
	 * 设置：剩余楼房
	 */
	public void setShengyuloufang(Integer shengyuloufang) {
		this.shengyuloufang = shengyuloufang;
	}
	/**
	 * 获取：剩余楼房
	 */
	public Integer getShengyuloufang() {
		return shengyuloufang;
	}

}
