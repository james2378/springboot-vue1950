package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoupanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoupanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoupanView;


/**
 * 楼盘
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface LoupanService extends IService<LoupanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoupanVO> selectListVO(Wrapper<LoupanEntity> wrapper);
   	
   	LoupanVO selectVO(@Param("ew") Wrapper<LoupanEntity> wrapper);
   	
   	List<LoupanView> selectListView(Wrapper<LoupanEntity> wrapper);
   	
   	LoupanView selectView(@Param("ew") Wrapper<LoupanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoupanEntity> wrapper);
   	
}

