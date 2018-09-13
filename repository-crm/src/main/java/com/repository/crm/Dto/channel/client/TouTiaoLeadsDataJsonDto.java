package com.repository.crm.Dto.channel.client;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.alibaba.fastjson.JSON;

import lombok.Data;

/**
 * 今日头条的传递参数中data的数据
 *
 * @author csy
 * @time 2018年3月28日 下午5:54:30
 */
@Data
public class TouTiaoLeadsDataJsonDto {

	private String label;
	private String id;
	private String value;
	 /**
	  * 字符串编码转换的实现方法
	  * @param str  待转换编码的字符串
	  * @param oldCharset 原编码
	  * @param newCharset 目标编码
	  * @return 
	  * @throws UnsupportedEncodingException
	  */
	 public static String changeCharset(String str, String oldCharset, String newCharset)
	   throws UnsupportedEncodingException {
	  if (str != null) {
	   //用旧的字符编码解码字符串。解码可能会出现异常。
	   byte[] bs = str.getBytes(oldCharset);
	   //用新的字符编码生成字符串
	   return new String(bs, newCharset);
	  }
	  return null;
	 }

	public static void main(String[] args) {
		
		String str = "data=%7B%22site_id%22%3A+%221596062001394696%22%2C+%22ad_id%22%3A+%22%22%2C+%22data%22%3A+%5B%7B%22lable%22%3A+%22%5Cu5e74%5Cu7ea7%22%2C+%22id%22%3A+1596162762595367%2C+%22value%22%3A+%22%5Cu521d%5Cu4e00%22%2C+%22label%22%3A+%22%5Cu5e74%5Cu7ea7%22%7D%2C+%7B%22lable%22%3A+%22%5Cu7535%5Cu8bdd%22%2C+%22id%22%3A+1596162762595351%2C+%22value%22%3A+%2215269875496%22%2C+%22label%22%3A+%22%5Cu7535%5Cu8bdd%22%7D%2C+%7B%22lable%22%3A+%22%5Cu79d1%5Cu76ee%22%2C+%22id%22%3A+1596162762595383%2C+%22value%22%3A+%22%5Cu82f1%5Cu8bed%22%2C+%22label%22%3A+%22%5Cu79d1%5Cu76ee%22%7D%2C+%7B%22lable%22%3A+%22%5Cu59d3%5Cu540d%22%2C+%22id%22%3A+1596162762595335%2C+%22value%22%3A+%22csy%22%2C+%22label%22%3A+%22%5Cu59d3%5Cu540d%22%7D%5D%7D";
		try {
			String s= java.net.URLDecoder.decode(str, "utf-8");
			System.out.println(s);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String json = "{data:'{'site_id': '1596062001394696', 'ad_id': '', 'data': [{'lable': '\u5e74\u7ea7', 'id': 1596162762595367, 'value': '\u521d\u4e8c', 'label': '\u5e74\u7ea7'}, {'lable': '\u7535\u8bdd', 'id': 1596162762595351, 'value': '13546789563', 'label': '\u7535\u8bdd'}, {'lable': '\u79d1\u76ee', 'id': 1596162762595383, 'value': '\u79d1\u5b66', 'label': '\u79d1\u76ee'}, {'lable': '\u59d3\u540d', 'id': 1596162762595335, 'value': 'csy', 'label': '\u59d3\u540d'}]}'}";
//		
//		String data = JSON.parseObject(json, TouTiaoLeadsDataDto.class).getData();
//		String jsonData = JSON.parseObject(data, TouTiaoLeadsJsonDto.class).getData();
//		System.out.println(jsonData);
//		List<TouTiaoLeadsDataJsonDto> touTiaoLeadsDataJsonDtos = JSON.parseArray(jsonData, TouTiaoLeadsDataJsonDto.class);
//		System.out.println(touTiaoLeadsDataJsonDtos.get(0).getId()+":"+touTiaoLeadsDataJsonDtos.get(0).getLabel()+":"+touTiaoLeadsDataJsonDtos.get(0).getValue());
	}
}
