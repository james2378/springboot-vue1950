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


import com.dao.LoupanguanliDao;
import com.entity.LoupanguanliEntity;
import com.service.LoupanguanliService;
import com.entity.vo.LoupanguanliVO;
import com.entity.view.LoupanguanliView;

@Service("loupanguanliService")
public class LoupanguanliServiceImpl extends ServiceImpl<LoupanguanliDao, LoupanguanliEntity> implements LoupanguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoupanguanliEntity> page = this.selectPage(
                new Query<LoupanguanliEntity>(params).getPage(),
                new EntityWrapper<LoupanguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoupanguanliEntity> wrapper) {
		  Page<LoupanguanliView> page =new Query<LoupanguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoupanguanliVO> selectListVO(Wrapper<LoupanguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoupanguanliVO selectVO(Wrapper<LoupanguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoupanguanliView> selectListView(Wrapper<LoupanguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoupanguanliView selectView(Wrapper<LoupanguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
