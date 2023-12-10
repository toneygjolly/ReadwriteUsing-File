package com.training.java;

import java.util.Scanner;

public class CheckMain {
Scanner sc;
public CheckMain() {
	sc=new Scanner(System.in);
}
	
	
	public void search() {
		String choice="Y";
		int ch=0;
		while(choice.equals("Y"))
		{
			System.out.println("1.Read the file");
			System.out.println("2.write the file");
			System.out.println("3.Exit");
			ch=sc.nextInt();
			Check chh=new Check();
			while(choice.equals("Y")) {
				switch(ch) {
				case 1:
					chh.readData();
                break;
				}
				
			}
		}
	}
	public static void main(String args []) {
		CheckMain checking=new CheckMain();
		checking.search();
	}
}
