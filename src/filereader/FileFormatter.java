/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jason.hodges
 */
public class FileFormatter {
    
    public static String editContents(String selection)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter part of the filename would you like to remove: ");
        String removeSelection = scanner.nextLine();
        
        return removeSelection;
    }
    
    public static String newContents(String selection)
    {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new values: ");
        String replace = scanner.nextLine();
        
        return replace;
    }

    public static File fileChange(String sourceDir, String remove, String replace)
    {
        Path dir = Paths.get(sourceDir);
        File fileDirectory = new File(sourceDir);
        String[] fileNames = fileDirectory.list();
        
        for(String name : fileNames)
        {
            File file = new File(dir+ File.separator+ name);
            if (!file.exists())
            {
                continue;
            }
            String replacedFileName = name.replaceAll(remove, replace);
            
            file.renameTo(new File(dir+ File.separator+ replacedFileName));
        }
        return null;
    }
    
    public static ArrayList tempList = new ArrayList(); 
    public static ArrayList tempChange(String sourceDir, String remove, String replace)
    {
        Path dir = Paths.get(sourceDir);
        File fileDirectory = new File(sourceDir);
        String[] fileNames = fileDirectory.list();
        
        for(String name : fileNames)
        {
            File file = new File(dir+ File.separator+ name);
            if (!file.exists())
            {
                continue;
            }
            String tempFileName = name.replaceAll(remove, replace);
            
            tempList.add(tempFileName);
        }
        return tempList;
    }
    
    
    
    
    
    
}
