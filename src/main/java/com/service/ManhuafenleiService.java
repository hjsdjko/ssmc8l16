package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ManhuafenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ManhuafenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ManhuafenleiView;


/**
 * 漫画分类
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface ManhuafenleiService extends IService<ManhuafenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ManhuafenleiVO> selectListVO(Wrapper<ManhuafenleiEntity> wrapper);
   	
   	ManhuafenleiVO selectVO(@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);
   	
   	List<ManhuafenleiView> selectListView(Wrapper<ManhuafenleiEntity> wrapper);
   	
   	ManhuafenleiView selectView(@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ManhuafenleiEntity> wrapper);
   	
}

