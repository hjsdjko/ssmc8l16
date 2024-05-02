package com.dao;

import com.entity.ManhuaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ManhuaxinxiVO;
import com.entity.view.ManhuaxinxiView;


/**
 * 漫画信息
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface ManhuaxinxiDao extends BaseMapper<ManhuaxinxiEntity> {
	
	List<ManhuaxinxiVO> selectListVO(@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);
	
	ManhuaxinxiVO selectVO(@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);
	
	List<ManhuaxinxiView> selectListView(@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);

	List<ManhuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);
	
	ManhuaxinxiView selectView(@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);
	
}
