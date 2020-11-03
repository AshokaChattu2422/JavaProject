package day10;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte b[]=new byte[100];
try{
	System.in.read(b);
	FileOutputStream fst=new FileOutputStream("text3.txt");
	fst.write(b);
	fst.close();
}
catch(IOException e){
	e.printStackTrace();
}
	}

}
