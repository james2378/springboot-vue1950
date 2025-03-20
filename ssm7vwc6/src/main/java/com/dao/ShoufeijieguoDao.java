package com.dao;

import com.entity.ShoufeijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoufeijieguoVO;
import com.entity.view.ShoufeijieguoView;


/**
 * 收费结果
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface ShoufeijieguoDao extends BaseMapper<ShoufeijieguoEntity> {
	
	List<ShoufeijieguoVO> selectListVO(@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);
	
	ShoufeijieguoVO selectVO(@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);
	
	List<ShoufeijieguoView> selectListView(@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);

	List<ShoufeijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);
	
	ShoufeijieguoView selectView(@Param("ew") Wrapper<ShoufeijieguoEntity> wrapper);
	
}
