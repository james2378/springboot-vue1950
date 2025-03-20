package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchedengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchedengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchedengjiView;


/**
 * 停车登记
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface TingchedengjiService extends IService<TingchedengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchedengjiVO> selectListVO(Wrapper<TingchedengjiEntity> wrapper);
   	
   	TingchedengjiVO selectVO(@Param("ew") Wrapper<TingchedengjiEntity> wrapper);
   	
   	List<TingchedengjiView> selectListView(Wrapper<TingchedengjiEntity> wrapper);
   	
   	TingchedengjiView selectView(@Param("ew") Wrapper<TingchedengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchedengjiEntity> wrapper);
   	
}

