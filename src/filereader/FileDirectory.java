/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jason.hodges
 */
public class FileDirectory {
    public static String getDirectory(String selection)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory you want to work in: ");
        String directorySelection = scanner.nextLine();
        
        System.out.println("******************************");
        System.out.println("Working Directory ---> " + directorySelection);
        System.out.println("******************************");
        return directorySelection;
    }
    
    
    
}
