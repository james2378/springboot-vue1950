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
 * 楼盘
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("loupan")
public class LoupanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoupanEntity() {
		
	}
	
	public LoupanEntity(T t) {
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
	 * 楼房介绍
	 */
					
	private String loufangjieshao;
	
	/**
	 * 楼盘位置
	 */
					
	private String loupanweizhi;
	
	/**
	 * 楼房类型
	 */
					
	private String loufangleixing;
	
	/**
	 * 楼层数量
	 */
					
	private Integer loucengshuliang;
	
	/**
	 * 楼盘价格
	 */
					
	private Integer loupanjiage;
	
	/**
	 * 楼盘状态
	 */
					
	private String loupanzhuangtai;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	/**
	 * 开盘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kaipanshijian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
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
	 * 设置：楼房介绍
	 */
	public void setLoufangjieshao(String loufangjieshao) {
		this.loufangjieshao = loufangjieshao;
	}
	/**
	 * 获取：楼房介绍
	 */
	public String getLoufangjieshao() {
		return loufangjieshao;
	}
	/**
	 * 设置：楼盘位置
	 */
	public void setLoupanweizhi(String loupanweizhi) {
		this.loupanweizhi = loupanweizhi;
	}
	/**
	 * 获取：楼盘位置
	 */
	public String getLoupanweizhi() {
		return loupanweizhi;
	}
	/**
	 * 设置：楼房类型
	 */
	public void setLoufangleixing(String loufangleixing) {
		this.loufangleixing = loufangleixing;
	}
	/**
	 * 获取：楼房类型
	 */
	public String getLoufangleixing() {
		return loufangleixing;
	}
	/**
	 * 设置：楼层数量
	 */
	public void setLoucengshuliang(Integer loucengshuliang) {
		this.loucengshuliang = loucengshuliang;
	}
	/**
	 * 获取：楼层数量
	 */
	public Integer getLoucengshuliang() {
		return loucengshuliang;
	}
	/**
	 * 设置：楼盘价格
	 */
	public void setLoupanjiage(Integer loupanjiage) {
		this.loupanjiage = loupanjiage;
	}
	/**
	 * 获取：楼盘价格
	 */
	public Integer getLoupanjiage() {
		return loupanjiage;
	}
	/**
	 * 设置：楼盘状态
	 */
	public void setLoupanzhuangtai(String loupanzhuangtai) {
		this.loupanzhuangtai = loupanzhuangtai;
	}
	/**
	 * 获取：楼盘状态
	 */
	public String getLoupanzhuangtai() {
		return loupanzhuangtai;
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
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
	/**
	 * 设置：开盘时间
	 */
	public void setKaipanshijian(Date kaipanshijian) {
		this.kaipanshijian = kaipanshijian;
	}
	/**
	 * 获取：开盘时间
	 */
	public Date getKaipanshijian() {
		return kaipanshijian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
