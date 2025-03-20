package com.dao;

import com.entity.TousuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousuguanliVO;
import com.entity.view.TousuguanliView;


/**
 * 投诉管理
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface TousuguanliDao extends BaseMapper<TousuguanliEntity> {
	
	List<TousuguanliVO> selectListVO(@Param("ew") Wrapper<TousuguanliEntity> wrapper);
	
	TousuguanliVO selectVO(@Param("ew") Wrapper<TousuguanliEntity> wrapper);
	
	List<TousuguanliView> selectListView(@Param("ew") Wrapper<TousuguanliEntity> wrapper);

	List<TousuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<TousuguanliEntity> wrapper);
	
	TousuguanliView selectView(@Param("ew") Wrapper<TousuguanliEntity> wrapper);
	
}
