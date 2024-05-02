package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmanhuaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmanhuaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmanhuaxinxiView;


/**
 * 漫画信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface DiscussmanhuaxinxiService extends IService<DiscussmanhuaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmanhuaxinxiVO> selectListVO(Wrapper<DiscussmanhuaxinxiEntity> wrapper);
   	
   	DiscussmanhuaxinxiVO selectVO(@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);
   	
   	List<DiscussmanhuaxinxiView> selectListView(Wrapper<DiscussmanhuaxinxiEntity> wrapper);
   	
   	DiscussmanhuaxinxiView selectView(@Param("ew") Wrapper<DiscussmanhuaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmanhuaxinxiEntity> wrapper);
   	
}

