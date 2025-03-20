package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuhushoufeiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuhushoufeiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuhushoufeiguanliView;


/**
 * 租户收费管理
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface ZuhushoufeiguanliService extends IService<ZuhushoufeiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuhushoufeiguanliVO> selectListVO(Wrapper<ZuhushoufeiguanliEntity> wrapper);
   	
   	ZuhushoufeiguanliVO selectVO(@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);
   	
   	List<ZuhushoufeiguanliView> selectListView(Wrapper<ZuhushoufeiguanliEntity> wrapper);
   	
   	ZuhushoufeiguanliView selectView(@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuhushoufeiguanliEntity> wrapper);
   	
}

