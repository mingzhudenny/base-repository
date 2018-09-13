package com.repository.crm.constant;

import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * 
 * <pre>
 * 课件管理
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CoursewareConstants.java, v 0.1 2018年3月7日 下午2:26:45  Exp $
 */
public class CoursewareConstants {

    /**
     * libreoffice5.3在docker中的命令路径
     */
    public static ConcurrentLinkedQueue<String> cmdQueueTest = new ConcurrentLinkedQueue<>();

    static {
        
         //TODO 测试环境为 11到15
    	cmdQueueTest.add("docker exec office11 /opt/libreoffice5.3/program/soffice ");
    	cmdQueueTest.add("docker exec office12 /opt/libreoffice5.3/program/soffice ");
    	cmdQueueTest.add("docker exec office13 /opt/libreoffice5.3/program/soffice ");
    	cmdQueueTest.add("docker exec office14 /opt/libreoffice5.3/program/soffice ");
    	cmdQueueTest.add("docker exec office15 /opt/libreoffice5.3/program/soffice ");
    	
    }  
    public static ConcurrentLinkedQueue<String> cmdQueue = new ConcurrentLinkedQueue<>();

    static {
        
         //TODO 正式环境容器名称要为11到20
         
        cmdQueue.add("docker exec office11 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office12 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office13 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office14 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office15 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office16 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office17 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office18 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office19 /opt/libreoffice5.3/program/soffice ");
        cmdQueue.add("docker exec office20 /opt/libreoffice5.3/program/soffice ");
    }  
    
    public static final String SALT = "Execution";

    //文件目录分隔符
    public static final String FILESEPARATOR = File.separator;
    public static final String SUCCESS = "success";
    /**
     * 课件保存目录
     */
    public static final String COURSEWARE = "courseware";
    /**
     * 录制文件保存目录
     */
    public static final String RECORD_DIR = "recordDir";

    /**
     * 文件上传保存根目录
     */
    public static final String UPLOAD_ROOT = "uploadPath";
    public static final String UPLOAD_ROOT2 = "uploadDir";
   
    /**
     * 技术支持redis zset的默认分数
     */
    public static final double DEFAULTSCORE = 0;    

   
}
