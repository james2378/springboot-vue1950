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


import com.dao.BaoxiuguanliDao;
import com.entity.BaoxiuguanliEntity;
import com.service.BaoxiuguanliService;
import com.entity.vo.BaoxiuguanliVO;
import com.entity.view.BaoxiuguanliView;

@Service("baoxiuguanliService")
public class BaoxiuguanliServiceImpl extends ServiceImpl<BaoxiuguanliDao, BaoxiuguanliEntity> implements BaoxiuguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiuguanliEntity> page = this.selectPage(
                new Query<BaoxiuguanliEntity>(params).getPage(),
                new EntityWrapper<BaoxiuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiuguanliEntity> wrapper) {
		  Page<BaoxiuguanliView> page =new Query<BaoxiuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiuguanliVO> selectListVO(Wrapper<BaoxiuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiuguanliVO selectVO(Wrapper<BaoxiuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiuguanliView> selectListView(Wrapper<BaoxiuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiuguanliView selectView(Wrapper<BaoxiuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
