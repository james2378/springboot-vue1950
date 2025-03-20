package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QianfeiyezhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QianfeiyezhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QianfeiyezhuView;


/**
 * 欠费业主
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface QianfeiyezhuService extends IService<QianfeiyezhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QianfeiyezhuVO> selectListVO(Wrapper<QianfeiyezhuEntity> wrapper);
   	
   	QianfeiyezhuVO selectVO(@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);
   	
   	List<QianfeiyezhuView> selectListView(Wrapper<QianfeiyezhuEntity> wrapper);
   	
   	QianfeiyezhuView selectView(@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QianfeiyezhuEntity> wrapper);
   	
}

