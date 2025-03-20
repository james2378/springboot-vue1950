package com.dao;

import com.entity.DiscusstousuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstousuguanliVO;
import com.entity.view.DiscusstousuguanliView;


/**
 * 投诉管理评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface DiscusstousuguanliDao extends BaseMapper<DiscusstousuguanliEntity> {
	
	List<DiscusstousuguanliVO> selectListVO(@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);
	
	DiscusstousuguanliVO selectVO(@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);
	
	List<DiscusstousuguanliView> selectListView(@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);

	List<DiscusstousuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);
	
	DiscusstousuguanliView selectView(@Param("ew") Wrapper<DiscusstousuguanliEntity> wrapper);
	
}
