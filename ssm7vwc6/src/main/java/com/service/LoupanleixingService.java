package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoupanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoupanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoupanleixingView;


/**
 * 楼盘类型
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface LoupanleixingService extends IService<LoupanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoupanleixingVO> selectListVO(Wrapper<LoupanleixingEntity> wrapper);
   	
   	LoupanleixingVO selectVO(@Param("ew") Wrapper<LoupanleixingEntity> wrapper);
   	
   	List<LoupanleixingView> selectListView(Wrapper<LoupanleixingEntity> wrapper);
   	
   	LoupanleixingView selectView(@Param("ew") Wrapper<LoupanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoupanleixingEntity> wrapper);
   	
}

