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
public class FileListing{
    
    public List<FileListing> theList = new ArrayList<>();
    
    public void addFiles(FileListing f){
        theList.add(f);
    }
    
    public List<FileListing> getTheList()
    {
        return theList;
    }
}
