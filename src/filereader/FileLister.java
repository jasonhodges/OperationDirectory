/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jason.hodges
 */
public class FileLister {
    public static List<Path> fileList = new LinkedList<>();
    public static List getFiles(String sourceDir) {
        Path dir = Paths.get(sourceDir);
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir))
            {
                System.out.println("========================================");
                System.out.println("****************************************");
                System.out.println("Current Files");
                System.out.println("_____________");
                for (Path file: stream) 
                {
                    fileList.add(file.getFileName());
                    
                    System.out.println(file.getFileName());
                }
                System.out.println("****************************************");
            }   catch (IOException | DirectoryIteratorException x) 
                {
                    // IOException can never be thrown by the iteration.
                    // In this snippet, it can only be thrown by newDirectoryStream.
                    System.err.println(x);
                }
            
            return fileList;
            
    }
    
}
