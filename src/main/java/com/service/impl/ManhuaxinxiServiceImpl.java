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


import com.dao.ManhuaxinxiDao;
import com.entity.ManhuaxinxiEntity;
import com.service.ManhuaxinxiService;
import com.entity.vo.ManhuaxinxiVO;
import com.entity.view.ManhuaxinxiView;

@Service("manhuaxinxiService")
public class ManhuaxinxiServiceImpl extends ServiceImpl<ManhuaxinxiDao, ManhuaxinxiEntity> implements ManhuaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ManhuaxinxiEntity> page = this.selectPage(
                new Query<ManhuaxinxiEntity>(params).getPage(),
                new EntityWrapper<ManhuaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ManhuaxinxiEntity> wrapper) {
		  Page<ManhuaxinxiView> page =new Query<ManhuaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ManhuaxinxiVO> selectListVO(Wrapper<ManhuaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ManhuaxinxiVO selectVO(Wrapper<ManhuaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ManhuaxinxiView> selectListView(Wrapper<ManhuaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ManhuaxinxiView selectView(Wrapper<ManhuaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
