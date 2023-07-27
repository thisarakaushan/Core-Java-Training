package com.highradius.product.management.utilities;

import java.io.FileWriter;

public class Logger {
	
	public static void logErrorMessage(String message, String FileName, String MethodName1, String MethodName2)
	{
		try 
		{
			FileWriter fw = new FileWriter(FilesConstants.ERROR_LOG_FILE_PATH, true);
			fw.write(message+","+FileName+","+MethodName1+","+MethodName2);
			fw.close();
		}
		
		catch(Exception Ex)
		{
			
		}
	}
	
}