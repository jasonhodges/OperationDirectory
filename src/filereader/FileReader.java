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
        
        
        String tempRemove = FileFormatter.editContents(null, 1);
        String tempReplace = FileFormatter.newContents(null, 1);
        
        List<FileListing> theList = new ArrayList<>();
        
        TheFiles files1 = new TheFiles();
        files1.theFiles = FileFormatter.tempChange(sourceDir, tempRemove, tempReplace);
        
        FileListing list1 = new FileListing();
        list1.addFiles(files1);
        
        for(FileListing listing : listing.getTheList()){ }
        System.out.println("========================================");
        
        
        ArrayList tempfileEdit = FileFormatter.tempChange(sourceDir, tempRemove, tempReplace);
        ArrayList tempFiles = new ArrayList();
        for (Iterator it1 = tempfileEdit.iterator(); it1.hasNext();)
        {
            String tempFile = (String) it1.next();
            tempFiles.add(tempFile);
            System.out.println(tempFile);
        }
        
        String remove = FileFormatter.editContents(null, 2);
        String replace = FileFormatter.newContents(null, 2);
        
        ArrayList filenameEdit = FileFormatter.fileChange(sourceDir, remove, replace);
        ArrayList permFiles = new ArrayList();
        for (Iterator it2 = filenameEdit.iterator(); it2.hasNext();)
        {
            String renamedFile = (String) it2.next();
            permFiles.add(renamedFile);
            System.out.println("<a href=\"/PDFfiles/" + renamedFile  + "\" />" );
        }
        
        //Iterator it1 = tempfileEdit.iterator();
        //Iterator it2 = filenameEdit.iterator();
//        while(tempFiles.iterator().hasNext() && permFiles.iterator().hasNext()){
//            System.out.println("<p>&nbsp;+&nbsp;<a href=\"PDFfiles/" + permFiles + "\" target=\"_blank\">" + tempFiles + "</a></p>" );
//        }
        System.out.println("<p>&nbsp;+&nbsp;<a href=\"PDFfiles/" + permFiles + "\" target=\"_blank\">" + tempFiles + "</a></p>" );
        
    }
    
    
    
    }
        
    
    
    public static String yoFile(String yoFileName) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name for new file: ");
        String fileName = scanner.nextLine();
       
        return fileName;
    }
}  

