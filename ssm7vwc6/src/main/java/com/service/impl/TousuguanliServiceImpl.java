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


import com.dao.TousuguanliDao;
import com.entity.TousuguanliEntity;
import com.service.TousuguanliService;
import com.entity.vo.TousuguanliVO;
import com.entity.view.TousuguanliView;

@Service("tousuguanliService")
public class TousuguanliServiceImpl extends ServiceImpl<TousuguanliDao, TousuguanliEntity> implements TousuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousuguanliEntity> page = this.selectPage(
                new Query<TousuguanliEntity>(params).getPage(),
                new EntityWrapper<TousuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousuguanliEntity> wrapper) {
		  Page<TousuguanliView> page =new Query<TousuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousuguanliVO> selectListVO(Wrapper<TousuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousuguanliVO selectVO(Wrapper<TousuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousuguanliView> selectListView(Wrapper<TousuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousuguanliView selectView(Wrapper<TousuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
