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


import com.dao.ManhuafenleiDao;
import com.entity.ManhuafenleiEntity;
import com.service.ManhuafenleiService;
import com.entity.vo.ManhuafenleiVO;
import com.entity.view.ManhuafenleiView;

@Service("manhuafenleiService")
public class ManhuafenleiServiceImpl extends ServiceImpl<ManhuafenleiDao, ManhuafenleiEntity> implements ManhuafenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ManhuafenleiEntity> page = this.selectPage(
                new Query<ManhuafenleiEntity>(params).getPage(),
                new EntityWrapper<ManhuafenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ManhuafenleiEntity> wrapper) {
		  Page<ManhuafenleiView> page =new Query<ManhuafenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ManhuafenleiVO> selectListVO(Wrapper<ManhuafenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ManhuafenleiVO selectVO(Wrapper<ManhuafenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ManhuafenleiView> selectListView(Wrapper<ManhuafenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ManhuafenleiView selectView(Wrapper<ManhuafenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
