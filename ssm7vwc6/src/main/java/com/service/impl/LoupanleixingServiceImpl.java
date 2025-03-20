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


import com.dao.LoupanleixingDao;
import com.entity.LoupanleixingEntity;
import com.service.LoupanleixingService;
import com.entity.vo.LoupanleixingVO;
import com.entity.view.LoupanleixingView;

@Service("loupanleixingService")
public class LoupanleixingServiceImpl extends ServiceImpl<LoupanleixingDao, LoupanleixingEntity> implements LoupanleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoupanleixingEntity> page = this.selectPage(
                new Query<LoupanleixingEntity>(params).getPage(),
                new EntityWrapper<LoupanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoupanleixingEntity> wrapper) {
		  Page<LoupanleixingView> page =new Query<LoupanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoupanleixingVO> selectListVO(Wrapper<LoupanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoupanleixingVO selectVO(Wrapper<LoupanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoupanleixingView> selectListView(Wrapper<LoupanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoupanleixingView selectView(Wrapper<LoupanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
