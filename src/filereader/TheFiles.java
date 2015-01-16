/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jason.hodges
 */
public class TheFiles {
    
    public static String aFile;
    
    
    ArrayList<TheFiles> theFiles = new ArrayList<>();
    
    public void addTheFiles(TheFiles f){
        theFiles.add(f);
    }
    
    public List<TheFiles> getTheFiles()
    {
        return theFiles;
    }
}
