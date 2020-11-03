package day6;
import java.io.*;
public class Handling
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    try{
    	BufferedReader bur=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter String ");
   String str=bur.readLine();
   System.out.println("Enter num");
   int n=Integer.parseInt(bur.readLine());
   //System.out.println("Enter num ");
  // int n1=Integer.parseInt(bur.readLine());
   System.out.println(str+" "+n);
   
    }
    catch(Exception e){
    	System.out.println("Io Exception");
    }
	}
}
    
   
	


