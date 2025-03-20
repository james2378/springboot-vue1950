package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstousuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstousuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstousuguanliView;


/**
 * 投诉管理评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface DiscusstousuguanliService extends IService<DiscusstousuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstousuguanliVO> selectListVO(Wrapper<DiscusstousuguanliEntity> wrapper);
   	
   	DiscusstousuguanliVO selectVO(@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);
   	
   	List<DiscusstousuguanliView> selectListView(Wrapper<DiscusstousuguanliEntity> wrapper);
   	
   	DiscusstousuguanliView selectView(@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstousuguanliEntity> wrapper);
   	
}

