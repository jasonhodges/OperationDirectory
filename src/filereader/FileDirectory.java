package filereader;

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
        
        System.out.println("****************************************");
        System.out.println("Working Directory ---> " + directorySelection);
        System.out.println("****************************************");
        return directorySelection;
    }
}
