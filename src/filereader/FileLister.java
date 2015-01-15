/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
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

    public static void main(String sourceDir) {
        Path dir = Paths.get(sourceDir);
        //List<String> list = new LinkedList<>();
        //File dirList[] = sourceDir.listFiles();
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir))
            {
                for (Path file: stream) 
                {
                    System.out.println(file.getFileName());
                }
            }   catch (IOException | DirectoryIteratorException x) 
                {
                    // IOException can never be thrown by the iteration.
                    // In this snippet, it can only be thrown by newDirectoryStream.
                    System.err.println(x);
                }
    }
    
}
