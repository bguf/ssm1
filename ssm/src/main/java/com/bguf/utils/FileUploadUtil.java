package com.bguf.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @Author
 * @Description
 * @Date 9:08 上午 2020/11/24
 */
public class FileUploadUtil
{
    public static String uploadFile(MultipartFile _file, String _uploadPath)
    {
        String orginalFilename = _file.getOriginalFilename();
        String suffix = orginalFilename.substring(orginalFilename.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString() + suffix;
        File file1 = new File(_uploadPath);
        if (!file1.exists())
        {
            file1.mkdir();
        }
        try
        {
            _file.transferTo(new File(_uploadPath + newFileName));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return newFileName;
    }
}
