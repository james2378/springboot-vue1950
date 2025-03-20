package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoupanguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoupanguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoupanguanliView;


/**
 * 楼盘管理
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface LoupanguanliService extends IService<LoupanguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoupanguanliVO> selectListVO(Wrapper<LoupanguanliEntity> wrapper);
   	
   	LoupanguanliVO selectVO(@Param("ew") Wrapper<LoupanguanliEntity> wrapper);
   	
   	List<LoupanguanliView> selectListView(Wrapper<LoupanguanliEntity> wrapper);
   	
   	LoupanguanliView selectView(@Param("ew") Wrapper<LoupanguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoupanguanliEntity> wrapper);
   	
}

