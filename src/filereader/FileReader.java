/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jason.hodges
 */
public abstract class FileReader {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    private static String sourceDir = null;
    private static List<Path> sourceFiles = null;
    
//    public FileReader(FileReader fr){
//        this(FileReader.sourceDir);
//    }
    public FileReader(String sourceDir){
        FileReader.sourceDir = sourceDir;
    }
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        
        sourceDir = FileDirectory.getDirectory(null);
        sourceFiles = FileLister.getFiles(sourceDir);
        
        //System.out.println(sourceFiles);
        
        String remove = FileFormatter.editContents(null);
        String replace = FileFormatter.newContents(null);
        
        ArrayList tempfileEdit = FileFormatter.tempChange(sourceDir,remove, replace);
        for (Iterator it = tempfileEdit.iterator(); it.hasNext();)
        {
            String tempFile = (String) it.next();
            System.out.println("<a href=\"/PDFfiles/" + tempFile + "\" />");
        }
        
        //File filenameEdit = FileFormatter.fileChange(sourceDir, remove, replace);
        
        //System.out.println(filenameEdit);
    }
    
    
    
        
    
    
    public static String yoFile(String yoFileName) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name for new file: ");
        String fileName = scanner.nextLine();
       
        return fileName;
    }
}  

