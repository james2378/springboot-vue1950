package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussloupanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussloupanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussloupanView;


/**
 * 楼盘评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface DiscussloupanService extends IService<DiscussloupanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussloupanVO> selectListVO(Wrapper<DiscussloupanEntity> wrapper);
   	
   	DiscussloupanVO selectVO(@Param("ew") Wrapper<DiscussloupanEntity> wrapper);
   	
   	List<DiscussloupanView> selectListView(Wrapper<DiscussloupanEntity> wrapper);
   	
   	DiscussloupanView selectView(@Param("ew") Wrapper<DiscussloupanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussloupanEntity> wrapper);
   	
}

