package com.employeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

/**
 * Purpose :
 * Test Case to Check the file EXits or Not.
 * To Delete File if Exits.
 * To Create New File Directory
 * To create File
 * Then, Print Files And Directories and
 */

public class NIOFileAPITest {
    private static String HOME = System.getProperty("user.home");
    private static String PLAY_WITH_NIO = "TempPlayGround";
    @Test
    public void givenPathWhenChecked_ThenConfirm() throws IOException{
        //Check File Exists
        Path homePath = Paths.get(HOME);
        Assertions.assertTrue(Files.exists(homePath));

        //Delete Files and Check File Not Exits
        Path playPath = Paths.get(HOME+"/"+PLAY_WITH_NIO);
        if(Files.exists(playPath))
            Files.delete(playPath);
        Assertions.assertTrue(Files.notExists(playPath));

        //Create Directory
        Files.createDirectory(playPath);
        Assertions.assertTrue(Files.exists(playPath));

        //Create File

        IntStream.range(1,10). forEach (count -> {
            Path tempFile = Paths.get(playPath + "/temp" + count);
            Assertions.assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            }
            catch (IOException e) {}
            Assertions.assertTrue(Files.exists(tempFile));
        });

        //List Files, Directories and files with Extensions

        Files.list(playPath).filter(Files :: isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() &&
                path.toString().startsWith("temp")).forEach(System.out::println);

    }
}