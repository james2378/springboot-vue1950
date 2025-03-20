package com.dao;

import com.entity.TingchedengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchedengjiVO;
import com.entity.view.TingchedengjiView;


/**
 * 停车登记
 * 
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public interface TingchedengjiDao extends BaseMapper<TingchedengjiEntity> {
	
	List<TingchedengjiVO> selectListVO(@Param("ew") Wrapper<TingchedengjiEntity> wrapper);
	
	TingchedengjiVO selectVO(@Param("ew") Wrapper<TingchedengjiEntity> wrapper);
	
	List<TingchedengjiView> selectListView(@Param("ew") Wrapper<TingchedengjiEntity> wrapper);

	List<TingchedengjiView> selectListView(Pagination page,@Param("ew") Wrapper<TingchedengjiEntity> wrapper);
	
	TingchedengjiView selectView(@Param("ew") Wrapper<TingchedengjiEntity> wrapper);
	
}
