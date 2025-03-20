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


import com.dao.DiscusstousuguanliDao;
import com.entity.DiscusstousuguanliEntity;
import com.service.DiscusstousuguanliService;
import com.entity.vo.DiscusstousuguanliVO;
import com.entity.view.DiscusstousuguanliView;

@Service("discusstousuguanliService")
public class DiscusstousuguanliServiceImpl extends ServiceImpl<DiscusstousuguanliDao, DiscusstousuguanliEntity> implements DiscusstousuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstousuguanliEntity> page = this.selectPage(
                new Query<DiscusstousuguanliEntity>(params).getPage(),
                new EntityWrapper<DiscusstousuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstousuguanliEntity> wrapper) {
		  Page<DiscusstousuguanliView> page =new Query<DiscusstousuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstousuguanliVO> selectListVO(Wrapper<DiscusstousuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstousuguanliVO selectVO(Wrapper<DiscusstousuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstousuguanliView> selectListView(Wrapper<DiscusstousuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstousuguanliView selectView(Wrapper<DiscusstousuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
