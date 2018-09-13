package com.repository.crm.Dto.account.server.course;

import java.util.ArrayList;
import java.util.List;

import com.aliyun.oss.OSSClient;
import com.base.utils.oss.OssUtils;

/**
 * 错题集合vo组装
 * @author csy
 * @date 2017-01-17
 */
public class ErrorQuestionVo {

	private String fileAddress;// 服务器路径
	private String originalFileName;// 原始名称
	private String serverFileName;// 服务器名称
	
	private List<ErrorQuestion> images = new ArrayList<>();//图片地址
	private List<ErrorQuestion> texts = new ArrayList<>();//文本地址
	
	
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}


	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	public void setServerFileName(String serverFileName) {
		this.serverFileName = serverFileName;
	}

	public List<ErrorQuestion> getImages() {
		
		String originalName[] = originalFileName.split(",");

		String serverName[] = serverFileName.split(",");

		for (int i = 0; i < serverName.length; i++) {
		   System.out.println("serverName[i]:"+serverName[i]);
		   if (serverName[i].contains(".jpg") || serverName[i].contains(".png")
					|| serverName[i].contains(".gif")) {
			   ErrorQuestion errorQuestion = new ErrorQuestion();
			   errorQuestion.setOriginalFileName(originalName[i]);
			   OSSClient ossClient = OssUtils.generateOssClient();
			   String url = OssUtils.generateFileUrl(ossClient, "errorQuestion/"+fileAddress+"/"+serverName[i]);
			   errorQuestion.setFileAddress(url);
			   ossClient.shutdown();
			   images.add(errorQuestion);
			} 
		}
		return images;
	}

	public void setImages(List<ErrorQuestion> images) {
		this.images = images;
	}

	public List<ErrorQuestion> getTexts() {
		String originalName[] = originalFileName.split(",");

		String serverName[] = serverFileName.split(",");

		for (int i = 0; i < serverName.length; i++) {
		  // String address = fileAddress + "/" + serverName[i];
		   if (serverName[i].contains(".doc") || serverName[i].contains(".docx")
					|| serverName[i].contains(".txt")) {
				   ErrorQuestion errorQuestion = new ErrorQuestion();
				   errorQuestion.setOriginalFileName(originalName[i]);
				   OSSClient ossClient = OssUtils.generateOssClient();
				   String url = OssUtils.generateFileUrl(ossClient, "errorQuestion/"+fileAddress+"/"+serverName[i]);
				   errorQuestion.setFileAddress(url);
				   ossClient.shutdown();
				   texts.add(errorQuestion);
			}
		}
		return texts;
	}

	public void setTexts(List<ErrorQuestion> texts) {
		this.texts = texts;
	}
	
}

