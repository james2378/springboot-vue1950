package com.entity.view;

import com.entity.QianfeiyezhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 欠费业主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("qianfeiyezhu")
public class QianfeiyezhuView  extends QianfeiyezhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QianfeiyezhuView(){
	}
 
 	public QianfeiyezhuView(QianfeiyezhuEntity qianfeiyezhuEntity){
 	try {
			BeanUtils.copyProperties(this, qianfeiyezhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
