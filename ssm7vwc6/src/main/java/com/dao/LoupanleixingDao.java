package com.dao;

import com.entity.LoupanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoupanleixingVO;
import com.entity.view.LoupanleixingView;


/**
 * 楼盘类型
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface LoupanleixingDao extends BaseMapper<LoupanleixingEntity> {
	
	List<LoupanleixingVO> selectListVO(@Param("ew") Wrapper<LoupanleixingEntity> wrapper);
	
	LoupanleixingVO selectVO(@Param("ew") Wrapper<LoupanleixingEntity> wrapper);
	
	List<LoupanleixingView> selectListView(@Param("ew") Wrapper<LoupanleixingEntity> wrapper);

	List<LoupanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<LoupanleixingEntity> wrapper);
	
	LoupanleixingView selectView(@Param("ew") Wrapper<LoupanleixingEntity> wrapper);
	
}
