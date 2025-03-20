package com.entity.view;

import com.entity.ShouhushoufeiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 售户收费管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("shouhushoufeiguanli")
public class ShouhushoufeiguanliView  extends ShouhushoufeiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouhushoufeiguanliView(){
	}
 
 	public ShouhushoufeiguanliView(ShouhushoufeiguanliEntity shouhushoufeiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, shouhushoufeiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
