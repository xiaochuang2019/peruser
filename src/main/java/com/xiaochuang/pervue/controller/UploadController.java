package com.xiaochuang.pervue.controller;

import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {
    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file){
        if (file!=null && !file.isEmpty()){
            String originalFilename = file.getOriginalFilename();
            String newFileName= UUID.randomUUID()+originalFilename.substring(originalFilename.indexOf("."));
            File file1=new File("D:\\pic",newFileName);
            try {
                file.transferTo(file1);
                String userface="http://localhost:92/img/"+newFileName;
               return ResultEntity.ok(userface);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ResultEntity.error();
    }
}
