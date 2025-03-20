package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhushoufeiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhushoufeiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhushoufeiguanliView;


/**
 * 售户收费管理
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface ShouhushoufeiguanliService extends IService<ShouhushoufeiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhushoufeiguanliVO> selectListVO(Wrapper<ShouhushoufeiguanliEntity> wrapper);
   	
   	ShouhushoufeiguanliVO selectVO(@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);
   	
   	List<ShouhushoufeiguanliView> selectListView(Wrapper<ShouhushoufeiguanliEntity> wrapper);
   	
   	ShouhushoufeiguanliView selectView(@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhushoufeiguanliEntity> wrapper);
   	
}

