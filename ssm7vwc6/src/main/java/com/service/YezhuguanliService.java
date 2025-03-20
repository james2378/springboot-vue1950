package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhuguanliView;


/**
 * 业主管理
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface YezhuguanliService extends IService<YezhuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhuguanliVO> selectListVO(Wrapper<YezhuguanliEntity> wrapper);
   	
   	YezhuguanliVO selectVO(@Param("ew") Wrapper<YezhuguanliEntity> wrapper);
   	
   	List<YezhuguanliView> selectListView(Wrapper<YezhuguanliEntity> wrapper);
   	
   	YezhuguanliView selectView(@Param("ew") Wrapper<YezhuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhuguanliEntity> wrapper);
   	
}

