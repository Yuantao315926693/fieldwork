package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UploadImageService {
//    @Value("${web.upload-path}")
//    private String path;
//    @Value("${server.context-path}")
//    private String contextPath;
//
//    public Boolean uploadImage(MultipartFile file) throws IOException {
//        if (file != null) {
//            if (file.getName() != null || "".equals(file.getName())) {
//                String[] name = file.getContentType().split("/");
//                SimpleDateFormat std = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String filename = "*****" + "_" + std.format(new Date()).toString() + name[name.length - 1];
//                String tmpFilePath = path + "/" + filename;
//                if ("BMP".equals(name[name.length - 1]) || "JPG".equals(name[name.length - 1])
//                        || "JPEG".equals(name[name.length - 1]) || "bmp".equals(name[name.length - 1])
//                        || "jpg".equals(name[name.length - 1]) || "jpeg".equals(name[name.length - 1])) {
//                    file.transferTo(new File(tmpFilePath));
//                }
//            }
//        }
//        return true;
//    }
}
//    try{
//        if(!file.isEmpty()){
//            String uploadFileName =  file.getOriginalFilename();
//            String pattern = "";
//            if(uploadFileName.contains(".")){
//                pattern = uploadFileName.substring(uploadFileName.lastIndexOf('.'));
//            }
//            SimpleDateFormat std = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String filename="*****"+"_"+std.format(new Date()).toString()+pattern;
//            String tmpFilePath = ResourceUtils.getURL("classpath:").getPath() + "/" + filename;
//            File tempFile = new File(tmpFilePath);
//            //写入临时文件
//            if(!tempFile.getParentFile().exists()){
//                tempFile.getParentFile().mkdir();
//            }
//            //转存文件
//            file.transferTo(tempFile);
//        }
//    }catch (Exception e){
//
//    }
