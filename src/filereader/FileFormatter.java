package filereader;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jason.hodges
 */
public class FileFormatter {
    
    public static String editContents(String selection, int part)
    {
        Scanner scanner = new Scanner(System.in);
        if (part == 1) {
            System.out.println("========================================");
            System.out.println("Enter part of filename you'd like to temporarly remove: ");
        }
        else{
            System.out.println("========================================");
            System.out.print("Enter part of the filename would you like to permanently remove: ");
        }
        String removeSelection = scanner.nextLine();
        
        return removeSelection;
    }
    
    public static String newContents(String selection, int part)
    {    
        Scanner scanner = new Scanner(System.in);
        if (part == 1) {
            System.out.println("========================================");
            System.out.println("Enter new temporary values: ");
            System.out.println("========================================");
        }
        else{
            System.out.println("========================================");
            System.out.print("Enter new permanent values: ");
            System.out.println("========================================");
        }
        String replace = scanner.nextLine();
        
        return replace;
    }
        
    public static ArrayList tempList = new ArrayList(); 
    public static ArrayList tempChange(String sourceDir, String tempRemove, String tempReplace)
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
            String tempFileName = name.replaceAll(tempRemove, tempReplace);
            
            tempList.add(tempFileName);
        }
        return tempList;
    }
    
    
    public static ArrayList fileList = new ArrayList();
    public static ArrayList fileChange(String sourceDir, String remove, String replace)
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
            
            
            fileList.add(replacedFileName);
        }
        return fileList;
    }
}
