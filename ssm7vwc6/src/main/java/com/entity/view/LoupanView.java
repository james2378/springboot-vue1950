package com.entity.view;

import com.entity.LoupanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 楼盘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("loupan")
public class LoupanView  extends LoupanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LoupanView(){
	}
 
 	public LoupanView(LoupanEntity loupanEntity){
 	try {
			BeanUtils.copyProperties(this, loupanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
