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


import com.dao.DiscussloupanDao;
import com.entity.DiscussloupanEntity;
import com.service.DiscussloupanService;
import com.entity.vo.DiscussloupanVO;
import com.entity.view.DiscussloupanView;

@Service("discussloupanService")
public class DiscussloupanServiceImpl extends ServiceImpl<DiscussloupanDao, DiscussloupanEntity> implements DiscussloupanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussloupanEntity> page = this.selectPage(
                new Query<DiscussloupanEntity>(params).getPage(),
                new EntityWrapper<DiscussloupanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussloupanEntity> wrapper) {
		  Page<DiscussloupanView> page =new Query<DiscussloupanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussloupanVO> selectListVO(Wrapper<DiscussloupanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussloupanVO selectVO(Wrapper<DiscussloupanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussloupanView> selectListView(Wrapper<DiscussloupanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussloupanView selectView(Wrapper<DiscussloupanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
