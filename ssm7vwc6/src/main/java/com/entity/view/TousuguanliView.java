package com.entity.view;

import com.entity.TousuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("tousuguanli")
public class TousuguanliView  extends TousuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TousuguanliView(){
	}
 
 	public TousuguanliView(TousuguanliEntity tousuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, tousuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
