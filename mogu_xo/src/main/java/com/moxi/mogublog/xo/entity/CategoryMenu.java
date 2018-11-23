package com.moxi.mogublog.xo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.moxi.mougblog.base.entity.SuperEntity;

/**
 * <p>
 * 菜单表(Vue Router表)
 * </p>
 *
 * @author xuzhixiang
 * @since 2018年11月23日10:35:03
 */
@TableName("t_category_menu")
public class CategoryMenu extends SuperEntity<CategoryMenu>{
	
	private static final long serialVersionUID = 1L;

    /**
     * 菜单名称
     */
    private String name;
    
    /**
     * 介绍
     */
    private String summary;

    /**
     * Icon图标
     */
    private String icon;
    
    /**
     * 父UID
     */
    private String parentUid;
    
    /**
     * URL地址
     */
    private String url;
    
    /**
     * 排序字段(越大越靠前)
     */
    private Integer sort;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getParentUid() {
		return parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}