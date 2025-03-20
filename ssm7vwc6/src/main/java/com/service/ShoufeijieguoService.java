package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoufeijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoufeijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoufeijieguoView;


/**
 * 收费结果
 *
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface ShoufeijieguoService extends IService<ShoufeijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoufeijieguoVO> selectListVO(Wrapper<ShoufeijieguoEntity> wrapper);
   	
   	ShoufeijieguoVO selectVO(@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);
   	
   	List<ShoufeijieguoView> selectListView(Wrapper<ShoufeijieguoEntity> wrapper);
   	
   	ShoufeijieguoView selectView(@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoufeijieguoEntity> wrapper);
   	
}

