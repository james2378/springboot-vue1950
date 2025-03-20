package com.dao;

import com.entity.QianfeiyezhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QianfeiyezhuVO;
import com.entity.view.QianfeiyezhuView;


/**
 * 欠费业主
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface QianfeiyezhuDao extends BaseMapper<QianfeiyezhuEntity> {
	
	List<QianfeiyezhuVO> selectListVO(@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);
	
	QianfeiyezhuVO selectVO(@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);
	
	List<QianfeiyezhuView> selectListView(@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);

	List<QianfeiyezhuView> selectListView(Pagination page,@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);
	
	QianfeiyezhuView selectView(@Param("ew") Wrapper<QianfeiyezhuEntity> wrapper);
	
}
