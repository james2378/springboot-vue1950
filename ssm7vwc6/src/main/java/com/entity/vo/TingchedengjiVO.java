package com.entity.vo;

import com.entity.TingchedengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 停车登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public class TingchedengjiVO  implements Serializable {
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
	 * 出入证
	 */
	
	private String churuzheng;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 车型
	 */
	
	private String chexing;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 车辆单位
	 */
	
	private String cheliangdanwei;
		
	/**
	 * 车辆状态
	 */
	
	private String cheliangzhuangtai;
		
	/**
	 * 进库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinkushijian;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
				
	
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
	 * 设置：出入证
	 */
	 
	public void setChuruzheng(String churuzheng) {
		this.churuzheng = churuzheng;
	}
	
	/**
	 * 获取：出入证
	 */
	public String getChuruzheng() {
		return churuzheng;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：车型
	 */
	 
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	
	/**
	 * 获取：车型
	 */
	public String getChexing() {
		return chexing;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
				
	
	/**
	 * 设置：车辆单位
	 */
	 
	public void setCheliangdanwei(String cheliangdanwei) {
		this.cheliangdanwei = cheliangdanwei;
	}
	
	/**
	 * 获取：车辆单位
	 */
	public String getCheliangdanwei() {
		return cheliangdanwei;
	}
				
	
	/**
	 * 设置：车辆状态
	 */
	 
	public void setCheliangzhuangtai(String cheliangzhuangtai) {
		this.cheliangzhuangtai = cheliangzhuangtai;
	}
	
	/**
	 * 获取：车辆状态
	 */
	public String getCheliangzhuangtai() {
		return cheliangzhuangtai;
	}
				
	
	/**
	 * 设置：进库时间
	 */
	 
	public void setJinkushijian(Date jinkushijian) {
		this.jinkushijian = jinkushijian;
	}
	
	/**
	 * 获取：进库时间
	 */
	public Date getJinkushijian() {
		return jinkushijian;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
			
}
