package com.dao;

import com.entity.DiscussloupanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussloupanVO;
import com.entity.view.DiscussloupanView;


/**
 * 楼盘评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface DiscussloupanDao extends BaseMapper<DiscussloupanEntity> {
	
	List<DiscussloupanVO> selectListVO(@Param("ew") Wrapper<DiscussloupanEntity> wrapper);
	
	DiscussloupanVO selectVO(@Param("ew") Wrapper<DiscussloupanEntity> wrapper);
	
	List<DiscussloupanView> selectListView(@Param("ew") Wrapper<DiscussloupanEntity> wrapper);

	List<DiscussloupanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussloupanEntity> wrapper);
	
	DiscussloupanView selectView(@Param("ew") Wrapper<DiscussloupanEntity> wrapper);
	
}
