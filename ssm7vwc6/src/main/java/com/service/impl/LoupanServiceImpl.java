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


import com.dao.LoupanDao;
import com.entity.LoupanEntity;
import com.service.LoupanService;
import com.entity.vo.LoupanVO;
import com.entity.view.LoupanView;

@Service("loupanService")
public class LoupanServiceImpl extends ServiceImpl<LoupanDao, LoupanEntity> implements LoupanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoupanEntity> page = this.selectPage(
                new Query<LoupanEntity>(params).getPage(),
                new EntityWrapper<LoupanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoupanEntity> wrapper) {
		  Page<LoupanView> page =new Query<LoupanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoupanVO> selectListVO(Wrapper<LoupanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoupanVO selectVO(Wrapper<LoupanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoupanView> selectListView(Wrapper<LoupanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoupanView selectView(Wrapper<LoupanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
