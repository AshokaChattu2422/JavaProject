package day6;

public class Arthimetic {
	 public static void main(String args[])
	   {
	      try{
	    	  System.exit(0);
	         int a=30, b=10;
	         int output=a/b;
	         System.out.println ("Result: "+output);
	         //System.exit(0);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	      catch(Exception e){
	    	  System.out.println("something worng");
	    	  
	      }
	      finally{
	    	  
			System.out.println("results ");
	   }
	 
		 
	 }
	 
		 
	 

}
