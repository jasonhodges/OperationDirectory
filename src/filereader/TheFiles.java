/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import static filereader.FileLister.fileList;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jason.hodges
 */
public class TheFiles {
    public static List<Path> theFiles = new LinkedList<>();
    
    //ArrayList theFiles = new ArrayList();
    

//    File f = new File(theFiles.toString());
//    String[] strs = f.list();
//    public TheFiles()
//    {
//        for (String thefiles : strs)
//        {
//            System.out.println(thefiles);
//        }
//    }
    
    public void addTheFiles(ArrayList f){
        ArrayList addFiles;
        addFiles = new ArrayList();
        for (Iterator it1 = f.iterator(); it1.hasNext();)
        {
            String tempFile = (String) it1.next();
            addFiles.add(tempFile);
            System.out.println(tempFile);
        }
    }
    
    
    
    public static List getFiles(String sourceDir) {
        Path dir = Paths.get(sourceDir);
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir))
            {
                System.out.println("******************************");
                System.out.println("Current Files");
                for (Path file: stream) 
                {
                    theFiles.add(file.getFileName());
                    
                    System.out.println(file.getFileName());
                }
                System.out.println("******************************");
            }   catch (IOException | DirectoryIteratorException x) 
                {
                    // IOException can never be thrown by the iteration.
                    // In this snippet, it can only be thrown by newDirectoryStream.
                    System.err.println(x);
                }
            
            return theFiles;
            
    }
}
