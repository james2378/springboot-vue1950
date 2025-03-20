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


import com.dao.ZuhushoufeiguanliDao;
import com.entity.ZuhushoufeiguanliEntity;
import com.service.ZuhushoufeiguanliService;
import com.entity.vo.ZuhushoufeiguanliVO;
import com.entity.view.ZuhushoufeiguanliView;

@Service("zuhushoufeiguanliService")
public class ZuhushoufeiguanliServiceImpl extends ServiceImpl<ZuhushoufeiguanliDao, ZuhushoufeiguanliEntity> implements ZuhushoufeiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuhushoufeiguanliEntity> page = this.selectPage(
                new Query<ZuhushoufeiguanliEntity>(params).getPage(),
                new EntityWrapper<ZuhushoufeiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuhushoufeiguanliEntity> wrapper) {
		  Page<ZuhushoufeiguanliView> page =new Query<ZuhushoufeiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuhushoufeiguanliVO> selectListVO(Wrapper<ZuhushoufeiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuhushoufeiguanliVO selectVO(Wrapper<ZuhushoufeiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuhushoufeiguanliView> selectListView(Wrapper<ZuhushoufeiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuhushoufeiguanliView selectView(Wrapper<ZuhushoufeiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
