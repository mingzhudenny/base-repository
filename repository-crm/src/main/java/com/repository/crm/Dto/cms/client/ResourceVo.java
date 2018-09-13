package com.repository.crm.Dto.cms.client;

import java.util.List;

import com.base.utils.validate.ValidateUtil;
import com.repository.crm.Po.Resource;


/**
 * 菜单资源关系对应表
 * @author csy
 * @since 20161209
 * @version 1.0
 */
public class ResourceVo extends Resource{
	
	 private List<ResourceVo> childMenu;
	
	 //是否拥有该权限
	 private String isHaving;

	public boolean getIsHaving() {
		
		if(ValidateUtil.isNotEmpty(isHaving)&&ValidateUtil.isNotStringNull(isHaving)){
			return true;
		}else{
			return false;
		}
	}

	public void setIsHaving(String isHaving) {
		this.isHaving = isHaving;
	}

	public List<ResourceVo> getChildMenu() {
		return childMenu;
	}

	public void setChildMenu(List<ResourceVo> childMenu) {
		this.childMenu = childMenu;
	}

    

}
