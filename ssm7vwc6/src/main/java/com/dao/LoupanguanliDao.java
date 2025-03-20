package com.dao;

import com.entity.LoupanguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoupanguanliVO;
import com.entity.view.LoupanguanliView;


/**
 * 楼盘管理
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface LoupanguanliDao extends BaseMapper<LoupanguanliEntity> {
	
	List<LoupanguanliVO> selectListVO(@Param("ew") Wrapper<LoupanguanliEntity> wrapper);
	
	LoupanguanliVO selectVO(@Param("ew") Wrapper<LoupanguanliEntity> wrapper);
	
	List<LoupanguanliView> selectListView(@Param("ew") Wrapper<LoupanguanliEntity> wrapper);

	List<LoupanguanliView> selectListView(Pagination page,@Param("ew") Wrapper<LoupanguanliEntity> wrapper);
	
	LoupanguanliView selectView(@Param("ew") Wrapper<LoupanguanliEntity> wrapper);
	
}
