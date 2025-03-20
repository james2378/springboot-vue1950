package com.entity.view;

import com.entity.TingchedengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
@TableName("tingchedengji")
public class TingchedengjiView  extends TingchedengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingchedengjiView(){
	}
 
 	public TingchedengjiView(TingchedengjiEntity tingchedengjiEntity){
 	try {
			BeanUtils.copyProperties(this, tingchedengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
