package com.entity.vo;

import com.entity.QianfeiyezhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 欠费业主
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public class QianfeiyezhuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 欠费金额
	 */
	
	private Integer qianfeijine;
		
	/**
	 * 滞纳金
	 */
	
	private Integer zhinajin;
		
	/**
	 * 还需缴费金额
	 */
	
	private Integer haixujiaofeijine;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：欠费金额
	 */
	 
	public void setQianfeijine(Integer qianfeijine) {
		this.qianfeijine = qianfeijine;
	}
	
	/**
	 * 获取：欠费金额
	 */
	public Integer getQianfeijine() {
		return qianfeijine;
	}
				
	
	/**
	 * 设置：滞纳金
	 */
	 
	public void setZhinajin(Integer zhinajin) {
		this.zhinajin = zhinajin;
	}
	
	/**
	 * 获取：滞纳金
	 */
	public Integer getZhinajin() {
		return zhinajin;
	}
				
	
	/**
	 * 设置：还需缴费金额
	 */
	 
	public void setHaixujiaofeijine(Integer haixujiaofeijine) {
		this.haixujiaofeijine = haixujiaofeijine;
	}
	
	/**
	 * 获取：还需缴费金额
	 */
	public Integer getHaixujiaofeijine() {
		return haixujiaofeijine;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
