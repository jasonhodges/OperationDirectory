/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jason.hodges
 */
public class FileListing {
   //List<FileListing> fileslist = new ArrayList<>();
    
    List<TheFiles> theFiles = new ArrayList<>();
    
    //List<FileListing> theList = new ArrayList<>();
    
    public void addFiles(TheFiles f){
        theFiles.add(f);
    }
//    public void addTheList(FileListing l){
//        theList.add(l);
//    }
    
//    public List<FileListing> getTheList()
//    {
//        return theList;
//    }
    
    
    
}
