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
public class FileListing{
    // each filelisting has a list of files
    public ArrayList theList;
    
    public FileListing(ArrayList list){
        this.theList = list;
    }

    public void addList(ArrayList f){
        theList.add(f);
    }
    
    public List<FileListing> getTheList(FileListing list){
        return theList;
    }

    void addAll(ArrayList tempChange) {
        theList.add(tempChange);
    }
}
