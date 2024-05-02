package com.entity.model;

import com.entity.ManhuaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 漫画信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 16:27:05
 */
public class ManhuaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 漫画名称
	 */
	
	private String manhuamingcheng;
		
	/**
	 * 漫画分类
	 */
	
	private String manhuafenlei;
		
	/**
	 * 地区
	 */
	
	private String diqu;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 漫画状态
	 */
	
	private String manhuazhuangtai;
		
	/**
	 * 开始阅读
	 */
	
	private String kaishiyuedu;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：漫画名称
	 */
	 
	public void setManhuamingcheng(String manhuamingcheng) {
		this.manhuamingcheng = manhuamingcheng;
	}
	
	/**
	 * 获取：漫画名称
	 */
	public String getManhuamingcheng() {
		return manhuamingcheng;
	}
				
	
	/**
	 * 设置：漫画分类
	 */
	 
	public void setManhuafenlei(String manhuafenlei) {
		this.manhuafenlei = manhuafenlei;
	}
	
	/**
	 * 获取：漫画分类
	 */
	public String getManhuafenlei() {
		return manhuafenlei;
	}
				
	
	/**
	 * 设置：地区
	 */
	 
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：作者
	 */
	 
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
				
	
	/**
	 * 设置：漫画状态
	 */
	 
	public void setManhuazhuangtai(String manhuazhuangtai) {
		this.manhuazhuangtai = manhuazhuangtai;
	}
	
	/**
	 * 获取：漫画状态
	 */
	public String getManhuazhuangtai() {
		return manhuazhuangtai;
	}
				
	
	/**
	 * 设置：开始阅读
	 */
	 
	public void setKaishiyuedu(String kaishiyuedu) {
		this.kaishiyuedu = kaishiyuedu;
	}
	
	/**
	 * 获取：开始阅读
	 */
	public String getKaishiyuedu() {
		return kaishiyuedu;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
