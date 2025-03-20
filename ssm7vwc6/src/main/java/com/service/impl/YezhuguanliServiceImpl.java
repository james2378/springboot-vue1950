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


import com.dao.YezhuguanliDao;
import com.entity.YezhuguanliEntity;
import com.service.YezhuguanliService;
import com.entity.vo.YezhuguanliVO;
import com.entity.view.YezhuguanliView;

@Service("yezhuguanliService")
public class YezhuguanliServiceImpl extends ServiceImpl<YezhuguanliDao, YezhuguanliEntity> implements YezhuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhuguanliEntity> page = this.selectPage(
                new Query<YezhuguanliEntity>(params).getPage(),
                new EntityWrapper<YezhuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhuguanliEntity> wrapper) {
		  Page<YezhuguanliView> page =new Query<YezhuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhuguanliVO> selectListVO(Wrapper<YezhuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhuguanliVO selectVO(Wrapper<YezhuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhuguanliView> selectListView(Wrapper<YezhuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhuguanliView selectView(Wrapper<YezhuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
