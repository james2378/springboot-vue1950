package com.entity.vo;

import com.entity.LoupanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 楼盘
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public class LoupanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
