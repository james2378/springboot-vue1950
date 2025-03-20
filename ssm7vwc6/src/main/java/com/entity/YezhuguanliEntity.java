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
 * 业主管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("yezhuguanli")
public class YezhuguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YezhuguanliEntity() {
		
	}
	
	public YezhuguanliEntity(T t) {
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
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 工作单位
	 */
					
	private String gongzuodanwei;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 通信地址
	 */
					
	private String tongxindizhi;
	
	/**
	 * 籍贯
	 */
					
	private String jiguan;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 入住楼房号
	 */
					
	private String ruzhuloufanghao;
	
	/**
	 * 入住时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhushijian;
	
	/**
	 * 契约交房日
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qiyuejiaofangri;
	
	/**
	 * 紧急联系人
	 */
					
	private String jinjilianxiren;
	
	/**
	 * 紧急联系电话
	 */
					
	private String jinjilianxidianhua;
	
	
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
	 * 设置：工作单位
	 */
	public void setGongzuodanwei(String gongzuodanwei) {
		this.gongzuodanwei = gongzuodanwei;
	}
	/**
	 * 获取：工作单位
	 */
	public String getGongzuodanwei() {
		return gongzuodanwei;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：通信地址
	 */
	public void setTongxindizhi(String tongxindizhi) {
		this.tongxindizhi = tongxindizhi;
	}
	/**
	 * 获取：通信地址
	 */
	public String getTongxindizhi() {
		return tongxindizhi;
	}
	/**
	 * 设置：籍贯
	 */
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	/**
	 * 获取：籍贯
	 */
	public String getJiguan() {
		return jiguan;
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
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：入住楼房号
	 */
	public void setRuzhuloufanghao(String ruzhuloufanghao) {
		this.ruzhuloufanghao = ruzhuloufanghao;
	}
	/**
	 * 获取：入住楼房号
	 */
	public String getRuzhuloufanghao() {
		return ruzhuloufanghao;
	}
	/**
	 * 设置：入住时间
	 */
	public void setRuzhushijian(Date ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	/**
	 * 获取：入住时间
	 */
	public Date getRuzhushijian() {
		return ruzhushijian;
	}
	/**
	 * 设置：契约交房日
	 */
	public void setQiyuejiaofangri(Date qiyuejiaofangri) {
		this.qiyuejiaofangri = qiyuejiaofangri;
	}
	/**
	 * 获取：契约交房日
	 */
	public Date getQiyuejiaofangri() {
		return qiyuejiaofangri;
	}
	/**
	 * 设置：紧急联系人
	 */
	public void setJinjilianxiren(String jinjilianxiren) {
		this.jinjilianxiren = jinjilianxiren;
	}
	/**
	 * 获取：紧急联系人
	 */
	public String getJinjilianxiren() {
		return jinjilianxiren;
	}
	/**
	 * 设置：紧急联系电话
	 */
	public void setJinjilianxidianhua(String jinjilianxidianhua) {
		this.jinjilianxidianhua = jinjilianxidianhua;
	}
	/**
	 * 获取：紧急联系电话
	 */
	public String getJinjilianxidianhua() {
		return jinjilianxidianhua;
	}

}
