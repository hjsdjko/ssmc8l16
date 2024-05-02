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


import com.dao.DiscussmanhuaxinxiDao;
import com.entity.DiscussmanhuaxinxiEntity;
import com.service.DiscussmanhuaxinxiService;
import com.entity.vo.DiscussmanhuaxinxiVO;
import com.entity.view.DiscussmanhuaxinxiView;

@Service("discussmanhuaxinxiService")
public class DiscussmanhuaxinxiServiceImpl extends ServiceImpl<DiscussmanhuaxinxiDao, DiscussmanhuaxinxiEntity> implements DiscussmanhuaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmanhuaxinxiEntity> page = this.selectPage(
                new Query<DiscussmanhuaxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussmanhuaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmanhuaxinxiEntity> wrapper) {
		  Page<DiscussmanhuaxinxiView> page =new Query<DiscussmanhuaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmanhuaxinxiVO> selectListVO(Wrapper<DiscussmanhuaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmanhuaxinxiVO selectVO(Wrapper<DiscussmanhuaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmanhuaxinxiView> selectListView(Wrapper<DiscussmanhuaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmanhuaxinxiView selectView(Wrapper<DiscussmanhuaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
