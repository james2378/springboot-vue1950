package com.entity.vo;

import com.entity.LoupanguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 楼盘管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public class LoupanguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
