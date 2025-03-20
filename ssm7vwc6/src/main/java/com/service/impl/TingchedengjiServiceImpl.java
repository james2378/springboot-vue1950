package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TingchedengjiDao;
import com.entity.TingchedengjiEntity;
import com.service.TingchedengjiService;
import com.entity.vo.TingchedengjiVO;
import com.entity.view.TingchedengjiView;

@Service("tingchedengjiService")
public class TingchedengjiServiceImpl extends ServiceImpl<TingchedengjiDao, TingchedengjiEntity> implements TingchedengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchedengjiEntity> page = this.selectPage(
                new Query<TingchedengjiEntity>(params).getPage(),
                new EntityWrapper<TingchedengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchedengjiEntity> wrapper) {
		  Page<TingchedengjiView> page =new Query<TingchedengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchedengjiVO> selectListVO(Wrapper<TingchedengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchedengjiVO selectVO(Wrapper<TingchedengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchedengjiView> selectListView(Wrapper<TingchedengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchedengjiView selectView(Wrapper<TingchedengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
