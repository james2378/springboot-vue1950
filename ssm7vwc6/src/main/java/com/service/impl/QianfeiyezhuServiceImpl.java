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


import com.dao.QianfeiyezhuDao;
import com.entity.QianfeiyezhuEntity;
import com.service.QianfeiyezhuService;
import com.entity.vo.QianfeiyezhuVO;
import com.entity.view.QianfeiyezhuView;

@Service("qianfeiyezhuService")
public class QianfeiyezhuServiceImpl extends ServiceImpl<QianfeiyezhuDao, QianfeiyezhuEntity> implements QianfeiyezhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QianfeiyezhuEntity> page = this.selectPage(
                new Query<QianfeiyezhuEntity>(params).getPage(),
                new EntityWrapper<QianfeiyezhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QianfeiyezhuEntity> wrapper) {
		  Page<QianfeiyezhuView> page =new Query<QianfeiyezhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QianfeiyezhuVO> selectListVO(Wrapper<QianfeiyezhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QianfeiyezhuVO selectVO(Wrapper<QianfeiyezhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QianfeiyezhuView> selectListView(Wrapper<QianfeiyezhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QianfeiyezhuView selectView(Wrapper<QianfeiyezhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
