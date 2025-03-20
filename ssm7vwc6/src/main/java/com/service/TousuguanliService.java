package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousuguanliView;


/**
 * 投诉管理
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface TousuguanliService extends IService<TousuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousuguanliVO> selectListVO(Wrapper<TousuguanliEntity> wrapper);
   	
   	TousuguanliVO selectVO(@Param("ew") Wrapper<TousuguanliEntity> wrapper);
   	
   	List<TousuguanliView> selectListView(Wrapper<TousuguanliEntity> wrapper);
   	
   	TousuguanliView selectView(@Param("ew") Wrapper<TousuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousuguanliEntity> wrapper);
   	
}

