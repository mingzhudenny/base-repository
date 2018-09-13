package com.repository.crm.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 基础传递参数
 *
 * @author csy
 * @time  2018年3月23日 下午2:24:18
 */
@ApiModel(value = "接口通用传参对象", description = "客户端通过数BaseDto")
public class BaseDto {

	@Setter
	@Getter
	@ApiModelProperty(value = "用户验证token", name = "token",required=true)
	private String token;
	
	@Setter
	@Getter
	@ApiModelProperty(value = "页码", name = "code", example = "100",required=false)
	private Integer pageIndex;
	
	@Setter
	@Getter
	@ApiModelProperty(value = "显示条数", name = "code", example = "10",required=false)
	private Integer pageNumber;
	
	@ApiModelProperty(value = "起始值", name = "startIndex", example = "1",required=false)
	private Integer startIndex;
	
	@Setter
	@Getter
	@ApiModelProperty(value = "排序规则", name = "orderBy", example = "name",required=false)
	private String orderBy;

	public Integer getStartIndex() {
		if(pageIndex != null && pageNumber != null){
			startIndex =Math.abs((pageIndex-1) * pageNumber);
		}
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	
}
