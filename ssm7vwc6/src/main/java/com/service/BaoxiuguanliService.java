package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiuguanliView;


/**
 * 报修管理
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface BaoxiuguanliService extends IService<BaoxiuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiuguanliVO> selectListVO(Wrapper<BaoxiuguanliEntity> wrapper);
   	
   	BaoxiuguanliVO selectVO(@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);
   	
   	List<BaoxiuguanliView> selectListView(Wrapper<BaoxiuguanliEntity> wrapper);
   	
   	BaoxiuguanliView selectView(@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiuguanliEntity> wrapper);
   	
}

