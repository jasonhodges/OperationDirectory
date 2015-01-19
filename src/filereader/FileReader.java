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

    public FileReader(String sourceDir){
        FileReader.sourceDir = sourceDir;
    }
    public static void main(String[] args) throws IOException{
        
        sourceDir = FileDirectory.getDirectory(null);
        sourceFiles = FileLister.getFiles(sourceDir);
        
        /*
        TODO make multi-pass for multi-format of filename
        (eg. remove underscores & remove file extension)
        */
        String tempRemove = FileFormatter.editContents(null, 1);    // get part of filename to tempRemove 
        String tempReplace = FileFormatter.newContents(null, 1);    // get part of filename to tempReplace
        
        ArrayList<String> tempfileEdit = FileFormatter.tempChange(sourceDir, tempRemove, tempReplace);
        
        FileListing list1 = new FileListing(tempfileEdit);
        
        ArrayList tempFiles = new ArrayList();
        
        for (Iterator it1 = list1.theList.iterator(); it1.hasNext();)
        {
            String tempFile = (String) it1.next();
            tempFiles.add(tempFile);
            System.out.println(tempFile);
        }
        System.out.println("========================================");
        
        String remove = FileFormatter.editContents(null, 2);
        String replace = FileFormatter.newContents(null, 2);
        
        ArrayList filenameEdit = FileFormatter.fileChange(sourceDir, remove, replace);
        
        ArrayList permFiles = new ArrayList();
        
        for (Iterator it2 = filenameEdit.iterator(); it2.hasNext();)
        {
            String renamedFile = (String) it2.next();
            permFiles.add(renamedFile);
//            System.out.println("<a href=\"/PDFfiles/" + renamedFile  + "\" />" );
        }
        
        //Iterator it1 = tempFiles.iterator();
        //Iterator it2 = permFiles.iterator();
        for(int i = 0; i < tempFiles.size() && i < permFiles.size(); i++){
            System.out.println("<p>&nbsp;+&nbsp;<a href=\"PDFfiles/RxPriorAuth/" + permFiles.get(i) + "\" target=\"_blank\">" + tempFiles.get(i) + "</a></p>" );
        }
    }
} 

