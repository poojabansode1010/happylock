package com.HappyLocate.Utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFileProperty {

	public static void main(String[] args) throws IOException {
		
		FileReader fr =new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\configfile.properties");
		
		Properties p=new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testURL"));

	}

}
