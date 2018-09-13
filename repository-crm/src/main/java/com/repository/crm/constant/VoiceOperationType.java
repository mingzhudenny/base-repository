/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 音频文件的操作类型
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: OperationType.java, v 0.1 2017年12月4日 下午1:39:54  Exp $
 */
public enum VoiceOperationType {
	
	PLAY_AUDIO(1,"播放音频"),DOWNLOAD_AUDIO (2,"下载音频");	
	VoiceOperationType(Integer value,String name){
				this.value = value;
				this.name = name;
			}
			private String name;
			private Integer value;
			
			public String getName() {
				return name;
			}
			public Integer getValue() {
				return value;
			}


}
