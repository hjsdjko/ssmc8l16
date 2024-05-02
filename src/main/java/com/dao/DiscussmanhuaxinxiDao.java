package com.dao;

import com.entity.DiscussmanhuaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmanhuaxinxiVO;
import com.entity.view.DiscussmanhuaxinxiView;


/**
 * 漫画信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface DiscussmanhuaxinxiDao extends BaseMapper<DiscussmanhuaxinxiEntity> {
	
	List<DiscussmanhuaxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);
	
	DiscussmanhuaxinxiVO selectVO(@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);
	
	List<DiscussmanhuaxinxiView> selectListView(@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);

	List<DiscussmanhuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);
	
	DiscussmanhuaxinxiView selectView(@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);
	
}
