package com.entity.view;

import com.entity.DiscusstousuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉管理评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("discusstousuguanli")
public class DiscusstousuguanliView  extends DiscusstousuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstousuguanliView(){
	}
 
 	public DiscusstousuguanliView(DiscusstousuguanliEntity discusstousuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, discusstousuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
