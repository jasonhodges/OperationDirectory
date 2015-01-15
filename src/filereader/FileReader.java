/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import filereader.FileLister;
import filereader.FileDirectory;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
    private final List<File> sourceFiles = null;
    
    public FileReader(FileReader fr){
        this(fr.sourceDir);
    }
    public FileReader(String sourceDir){
        FileReader.sourceDir = sourceDir;
    }
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        
        sourceDir = FileDirectory.getDirectory(null);
    }
//    public static void main(String[] args) throws IOException 
//    {
//        // TODO code application logic here
//        //FileReader fr = new FileReader();
//        Scanner scanner = new Scanner(System.in);
//        int ranOnce = 0;
//        int proceed = 1;
//        String directory = getDirectory(null);
//        
//        
//        do
//        {
//        Path dir = Paths.get(directory);
//        
//            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir))
//            {
//                for (Path file: stream) 
//                {
//                    System.out.println(file.getFileName());
//                }
//            }   catch (IOException | DirectoryIteratorException x) 
//                {
//                    // IOException can never be thrown by the iteration.
//                    // In this snippet, it can only be thrown by newDirectoryStream.
//                    System.err.println(x);
//                }
//        
//            if(ranOnce > 0)
//            {
//                System.out.println("Enter 0 to quit, 1 to continue, 2 to write file: ");
//                proceed = scanner.nextInt();
//            }
//            
//            if(proceed == 1)
//            {
//            String erase = editContents(null);
//
//            String replace = newContents(null);
//
//            File dir2 = new File(directory);
//            String[] strs = dir2.list();
//
//
//                for (String string : strs) 
//                {
//                    File file = new File(dir+ File.separator+ string);
//                    if (!file.exists())
//                    {
//                        continue;
//                    }
//                    String replacedFileName = string.replaceAll(erase, replace);
//                    
//                    String[] tempA = replacedFileName.split(".pdf");
//                    
//                    System.out.println("replaced: " + replacedFileName);
//                    System.out.println("tempA: " + Arrays.toString(tempA));
//                    
//                    file.renameTo(new File(dir+ File.separator+ replacedFileName));
//                } 
//            }ranOnce++;
//        }while(proceed == 1);
//        
//        
//        
//        if(proceed == 2)
//        {
//            String newFile = yoFile(null);
//            File fwDir = new File(directory);
//            String[] fwStrs = fwDir.list();
//            System.out.println(newFile);
//            System.out.println(fwDir.getAbsolutePath());
//            try
//            {
//                try ( FileWriter fw = new FileWriter(fwDir + "\\" + newFile)) 
//                {
//                    for (String string : fwStrs)
//                    {
//                        fw.write(String.format(string));
//                        fw.write(System.lineSeparator());
//                    }
//                    fw.flush();
//                }
//            }   catch (IOException ex) 
//                {
//                }
//        }
//        
//        
////        String linkFormatA = "<p>&nbsp;+&nbsp;<a href=\"PDFFiles/";  
////        String linkFormatB = "\" target=\"_blank\">";
////        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
////            for (Path file: stream) {
////                System.out.println(file.getFileName());
////            }
////        } catch (IOException | DirectoryIteratorException x) {
////            // IOException can never be thrown by the iteration.
////            // In this snippet, it can only be thrown by newDirectoryStream.
////            System.err.println(x);
////        }
//}
//    
//    
////    public static String getDirectory(String selection)
////    {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter the directory you want to read: ");
////        String directorySelection = scanner.nextLine();
////        
////        return getDirectory;
////    }
//    
    public static String editContents(String selection)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter part of the filename would you like to remove: ");
        String eraseSelection = scanner.nextLine();
        
        return eraseSelection;
    }
        
    public static String newContents(String selection)
    {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new values: ");
        String replace = scanner.nextLine();
        
        return replace;
    }
    
    public static String yoFile(String yoFileName) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name for new file: ");
        String fileName = scanner.nextLine();
       
        return fileName;
    }
}  

