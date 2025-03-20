package com.dao;

import com.entity.YezhuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhuguanliVO;
import com.entity.view.YezhuguanliView;


/**
 * 业主管理
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface YezhuguanliDao extends BaseMapper<YezhuguanliEntity> {
	
	List<YezhuguanliVO> selectListVO(@Param("ew") Wrapper<YezhuguanliEntity> wrapper);
	
	YezhuguanliVO selectVO(@Param("ew") Wrapper<YezhuguanliEntity> wrapper);
	
	List<YezhuguanliView> selectListView(@Param("ew") Wrapper<YezhuguanliEntity> wrapper);

	List<YezhuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<YezhuguanliEntity> wrapper);
	
	YezhuguanliView selectView(@Param("ew") Wrapper<YezhuguanliEntity> wrapper);
	
}
