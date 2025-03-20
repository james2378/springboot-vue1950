package com.dao;

import com.entity.ZuhushoufeiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuhushoufeiguanliVO;
import com.entity.view.ZuhushoufeiguanliView;


/**
 * 租户收费管理
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface ZuhushoufeiguanliDao extends BaseMapper<ZuhushoufeiguanliEntity> {
	
	List<ZuhushoufeiguanliVO> selectListVO(@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);
	
	ZuhushoufeiguanliVO selectVO(@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);
	
	List<ZuhushoufeiguanliView> selectListView(@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);

	List<ZuhushoufeiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);
	
	ZuhushoufeiguanliView selectView(@Param("ew") Wrapper<ZuhushoufeiguanliEntity> wrapper);
	
}
