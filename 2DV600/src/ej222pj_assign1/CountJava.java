/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name CountJava.java
 */
package ej222pj_assign1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Eric
 *
 * @date 6 sep 2016 : @time 13:48:44
 *
 */
public class CountJava {

	public static void main(String[] args) throws IOException{
		try{
			findDirectory(args[0].toString());
		}catch(NullPointerException e){
			System.err.println("Can't find any directory!");
		}
	}
	
	public static void findDirectory(String path)throws IOException {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		System.out.println("Current directory: " + path);
		int count = 0;
		for (int i = 0; i < listOfFiles.length; i++) {
			//If its a directory
			if (listOfFiles[i].isDirectory()){
				count = 0;
				findDirectory(path + "\\" + listOfFiles[i].getName());
			}
			//If its a file
			else if (listOfFiles[i].isFile()) {
				count++;
				readFile(path, listOfFiles[i].getName(), count);
			} 
		}
	}
	
	public static void readFile(String directoryPath, String fileName, int numberOfFilesInDirr) throws IOException {
		InputStream inputStream = new BufferedInputStream(new FileInputStream(directoryPath + "\\" + fileName));
		int count = 1;
	    try {
	        byte[] c = new byte[1024];
	        //Reads the file and looks for a new line
	        int readChars = 0;
	        while ((readChars = inputStream.read(c)) != -1) {
	            for (int j = 0; j < readChars; ++j) {
	                if (c[j] == '\n') {
	                    ++count;
	                }
	            }
	        }
	    }catch(IOException e){
	    	System.err.println("Cannot read, something is super wrong!");
	    } finally {
	    	inputStream.close();
	    }  
	    System.out.println(numberOfFilesInDirr + " " + fileName + " lines = " + count);
	}
}
