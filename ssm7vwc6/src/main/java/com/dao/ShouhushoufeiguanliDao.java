package com.dao;

import com.entity.ShouhushoufeiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhushoufeiguanliVO;
import com.entity.view.ShouhushoufeiguanliView;


/**
 * 售户收费管理
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface ShouhushoufeiguanliDao extends BaseMapper<ShouhushoufeiguanliEntity> {
	
	List<ShouhushoufeiguanliVO> selectListVO(@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);
	
	ShouhushoufeiguanliVO selectVO(@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);
	
	List<ShouhushoufeiguanliView> selectListView(@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);

	List<ShouhushoufeiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);
	
	ShouhushoufeiguanliView selectView(@Param("ew") Wrapper<ShouhushoufeiguanliEntity> wrapper);
	
}
