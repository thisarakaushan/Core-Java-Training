package com.hightadius.customer.management.utilities;

import java.io.FileWriter;

public class Logger {
	
	public static void logErrorMessage(String message, String FileName, String MethodName)
	{
		try 
		{
			FileWriter fw = new FileWriter(FilesConstants.ERROR_LOG_FILE_PATH, true);
			fw.write(message+","+FileName+","+MethodName);
			fw.close();
		}
		
		catch(Exception Ex)
		{
			
		}
	}
	

}
