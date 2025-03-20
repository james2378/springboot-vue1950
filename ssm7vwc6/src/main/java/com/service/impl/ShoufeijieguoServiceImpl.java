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


import com.dao.ShoufeijieguoDao;
import com.entity.ShoufeijieguoEntity;
import com.service.ShoufeijieguoService;
import com.entity.vo.ShoufeijieguoVO;
import com.entity.view.ShoufeijieguoView;

@Service("shoufeijieguoService")
public class ShoufeijieguoServiceImpl extends ServiceImpl<ShoufeijieguoDao, ShoufeijieguoEntity> implements ShoufeijieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoufeijieguoEntity> page = this.selectPage(
                new Query<ShoufeijieguoEntity>(params).getPage(),
                new EntityWrapper<ShoufeijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoufeijieguoEntity> wrapper) {
		  Page<ShoufeijieguoView> page =new Query<ShoufeijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoufeijieguoVO> selectListVO(Wrapper<ShoufeijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoufeijieguoVO selectVO(Wrapper<ShoufeijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoufeijieguoView> selectListView(Wrapper<ShoufeijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoufeijieguoView selectView(Wrapper<ShoufeijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
