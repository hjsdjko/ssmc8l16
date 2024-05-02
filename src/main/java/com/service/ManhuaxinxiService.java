package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ManhuaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ManhuaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ManhuaxinxiView;


/**
 * 漫画信息
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface ManhuaxinxiService extends IService<ManhuaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ManhuaxinxiVO> selectListVO(Wrapper<ManhuaxinxiEntity> wrapper);
   	
   	ManhuaxinxiVO selectVO(@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);
   	
   	List<ManhuaxinxiView> selectListView(Wrapper<ManhuaxinxiEntity> wrapper);
   	
   	ManhuaxinxiView selectView(@Param("ew") Wrapper<ManhuaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ManhuaxinxiEntity> wrapper);
   	
}

