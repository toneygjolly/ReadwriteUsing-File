package com.training.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Check {
FileOutputStream output;
public Check()
{
	
}
public void writeData()
{
	try
	{
		String str="Input output example ";
		output=new FileOutputStream("/home/administrator/Documents/JAVA/day1/h1.txt");
		output.write(str.getBytes());
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
public void readData() {
	try
	{
		FileInputStream finput=
				new FileInputStream("/home/administrator/Documents/JAVA/day1/h1.txt");
					byte data[]=new byte[finput.available()];
					finput.read(data);
					for(int x=0;x<data.length;x++)
					{
						System.out.print((char)data[x]);
					}
	}
	catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
	catch(IOException ex)
	{
		System.out.println(ex.getMessage());
	}
}
public static void main(String args[])
{
	System.out.println("Reading data");
	Check finput=new Check();
	finput.readData();
	finput.writeData();
	finput.readData();
}
}
