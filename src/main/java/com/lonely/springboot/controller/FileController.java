package com.lonely.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author xyLonely
 * @date 2019/3/21 11:17
 */
@Controller
@RestController
public class FileController {

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        try {
            //先判断上传文件是否为空
            if (file.isEmpty()) {
                return "上传文件为空!";
            }
            //获取文件名
            String filename = file.getOriginalFilename();
            //去掉文件名的后缀
            String name = filename.substring(0,filename.lastIndexOf("."));
            //设置储存路径
            File newfile = new File("D://upload//"+filename);
            if (!newfile.getParentFile().exists()) {
                newfile.getParentFile().mkdirs();
                newfile.createNewFile();
            }
            file.transferTo(newfile);
            return "上传成功!";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }


}
