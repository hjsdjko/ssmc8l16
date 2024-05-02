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


import com.dao.DiqufenleiDao;
import com.entity.DiqufenleiEntity;
import com.service.DiqufenleiService;
import com.entity.vo.DiqufenleiVO;
import com.entity.view.DiqufenleiView;

@Service("diqufenleiService")
public class DiqufenleiServiceImpl extends ServiceImpl<DiqufenleiDao, DiqufenleiEntity> implements DiqufenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiqufenleiEntity> page = this.selectPage(
                new Query<DiqufenleiEntity>(params).getPage(),
                new EntityWrapper<DiqufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiqufenleiEntity> wrapper) {
		  Page<DiqufenleiView> page =new Query<DiqufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiqufenleiVO> selectListVO(Wrapper<DiqufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiqufenleiVO selectVO(Wrapper<DiqufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiqufenleiView> selectListView(Wrapper<DiqufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiqufenleiView selectView(Wrapper<DiqufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
