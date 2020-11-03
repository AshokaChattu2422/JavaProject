package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	public static void main (String []args){
		FileOutputStream f=null;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the text");
			String s=sc.nextLine();
			f=new FileOutputStream ("text3.txt",true);
			f.write(s.getBytes());
			f.write("\r\n".getBytes());
			f.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}	
		
	}


