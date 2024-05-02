package com.dao;

import com.entity.ManhuafenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ManhuafenleiVO;
import com.entity.view.ManhuafenleiView;


/**
 * 漫画分类
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public interface ManhuafenleiDao extends BaseMapper<ManhuafenleiEntity> {
	
	List<ManhuafenleiVO> selectListVO(@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);
	
	ManhuafenleiVO selectVO(@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);
	
	List<ManhuafenleiView> selectListView(@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);

	List<ManhuafenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);
	
	ManhuafenleiView selectView(@Param("ew") Wrapper<ManhuafenleiEntity> wrapper);
	
}
