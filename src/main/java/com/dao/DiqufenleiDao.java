package com.dao;

import com.entity.DiqufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiqufenleiVO;
import com.entity.view.DiqufenleiView;


/**
 * 地区分类
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface DiqufenleiDao extends BaseMapper<DiqufenleiEntity> {
	
	List<DiqufenleiVO> selectListVO(@Param("ew") Wrapper<DiqufenleiEntity> wrapper);
	
	DiqufenleiVO selectVO(@Param("ew") Wrapper<DiqufenleiEntity> wrapper);
	
	List<DiqufenleiView> selectListView(@Param("ew") Wrapper<DiqufenleiEntity> wrapper);

	List<DiqufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<DiqufenleiEntity> wrapper);
	
	DiqufenleiView selectView(@Param("ew") Wrapper<DiqufenleiEntity> wrapper);
	
}
