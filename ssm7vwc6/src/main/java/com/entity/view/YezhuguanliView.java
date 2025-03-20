package com.entity.view;

import com.entity.YezhuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业主管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("yezhuguanli")
public class YezhuguanliView  extends YezhuguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YezhuguanliView(){
	}
 
 	public YezhuguanliView(YezhuguanliEntity yezhuguanliEntity){
 	try {
			BeanUtils.copyProperties(this, yezhuguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
