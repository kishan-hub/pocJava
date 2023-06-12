package com.demo.var;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;

public class VarDemoAnalysis {
	
	public static void main(String[] args) throws IOException {
//		
//		String message ="Hello wolrd!";
//		
//		Path path =Path.of(message);
//		
//		InputStream stream =Files.newInputStream(path);
//		
//		int value=stream.read();
//		System.out.println(value);
		
//		var message="Hello World!";
//		
//		var path =Path.of(message);
//		
//		var stream =Files.newInputStream(path);
		
		
		//Example with var
		
		var list =List.of("one","two","three","four");
		
		for(var element:list) {
			System.out.println(element);
		}
		
		
//		try
//		{
//
//			var path =Path.of("https://dev.java/learn/language-basics/using-var/");
//			
//			var stream =Files.newInputStream(path);
//			
//			System.out.println(stream);
//		}
//		catch (Exception e) {
//            e.printStackTrace();
//		}
//		
//		
		
		
		
		
		
	}

}
