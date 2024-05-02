package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiqufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiqufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiqufenleiView;


/**
 * 地区分类
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface DiqufenleiService extends IService<DiqufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiqufenleiVO> selectListVO(Wrapper<DiqufenleiEntity> wrapper);
   	
   	DiqufenleiVO selectVO(@Param("ew") Wrapper<DiqufenleiEntity> wrapper);
   	
   	List<DiqufenleiView> selectListView(Wrapper<DiqufenleiEntity> wrapper);
   	
   	DiqufenleiView selectView(@Param("ew") Wrapper<DiqufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiqufenleiEntity> wrapper);
   	
}

