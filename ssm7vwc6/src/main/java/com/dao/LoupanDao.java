package com.dao;

import com.entity.LoupanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoupanVO;
import com.entity.view.LoupanView;


/**
 * 楼盘
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface LoupanDao extends BaseMapper<LoupanEntity> {
	
	List<LoupanVO> selectListVO(@Param("ew") Wrapper<LoupanEntity> wrapper);
	
	LoupanVO selectVO(@Param("ew") Wrapper<LoupanEntity> wrapper);
	
	List<LoupanView> selectListView(@Param("ew") Wrapper<LoupanEntity> wrapper);

	List<LoupanView> selectListView(Pagination page,@Param("ew") Wrapper<LoupanEntity> wrapper);
	
	LoupanView selectView(@Param("ew") Wrapper<LoupanEntity> wrapper);
	
}
