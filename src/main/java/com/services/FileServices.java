package com.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileServices {
	
	// This method checks if the file in the path given exists
	public static boolean doesFileExist(Path path) {

		if( Files.exists(path) ) 
			System.out.println(" The file exists");
		else 
			System.out.println(" The file does not exist");
		
		return Files.exists(path);
	}
	
	// This method deletes the file in the path and then calls the doesFileExist() method
	public static void deleteFile(Path path) {
		try {
			Files.deleteIfExists(path);
			doesFileExist(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createDirectory(Path path) {
		try {
			Files.createDirectory(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createFile(Path path) {
		try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void listFiles(Path path) {
		try {
			Files.list(path).forEach(file -> System.out.println(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
