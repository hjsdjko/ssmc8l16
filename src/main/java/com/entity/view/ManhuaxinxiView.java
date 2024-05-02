package com.entity.view;

import com.entity.ManhuaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 漫画信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
@TableName("manhuaxinxi")
public class ManhuaxinxiView  extends ManhuaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ManhuaxinxiView(){
	}
 
 	public ManhuaxinxiView(ManhuaxinxiEntity manhuaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, manhuaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
