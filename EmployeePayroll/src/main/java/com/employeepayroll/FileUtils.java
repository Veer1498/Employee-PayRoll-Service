package com.employeepayroll;

import java.io.File;

public class FileUtils {
    public static boolean deleteFiles(File contents){
        File [] allContents = contents.listFiles();
        if(allContents != null){
            for(File file : allContents){
                deleteFiles(file);
            }
        }
        return contents.delete();
    }
}
