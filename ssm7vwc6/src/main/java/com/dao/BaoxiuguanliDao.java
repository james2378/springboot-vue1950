package com.dao;

import com.entity.BaoxiuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiuguanliVO;
import com.entity.view.BaoxiuguanliView;


/**
 * 报修管理
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface BaoxiuguanliDao extends BaseMapper<BaoxiuguanliEntity> {
	
	List<BaoxiuguanliVO> selectListVO(@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);
	
	BaoxiuguanliVO selectVO(@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);
	
	List<BaoxiuguanliView> selectListView(@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);

	List<BaoxiuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);
	
	BaoxiuguanliView selectView(@Param("ew") Wrapper<BaoxiuguanliEntity> wrapper);
	
}
