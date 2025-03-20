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


import com.dao.ShouhushoufeiguanliDao;
import com.entity.ShouhushoufeiguanliEntity;
import com.service.ShouhushoufeiguanliService;
import com.entity.vo.ShouhushoufeiguanliVO;
import com.entity.view.ShouhushoufeiguanliView;

@Service("shouhushoufeiguanliService")
public class ShouhushoufeiguanliServiceImpl extends ServiceImpl<ShouhushoufeiguanliDao, ShouhushoufeiguanliEntity> implements ShouhushoufeiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouhushoufeiguanliEntity> page = this.selectPage(
                new Query<ShouhushoufeiguanliEntity>(params).getPage(),
                new EntityWrapper<ShouhushoufeiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouhushoufeiguanliEntity> wrapper) {
		  Page<ShouhushoufeiguanliView> page =new Query<ShouhushoufeiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouhushoufeiguanliVO> selectListVO(Wrapper<ShouhushoufeiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouhushoufeiguanliVO selectVO(Wrapper<ShouhushoufeiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouhushoufeiguanliView> selectListView(Wrapper<ShouhushoufeiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouhushoufeiguanliView selectView(Wrapper<ShouhushoufeiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
