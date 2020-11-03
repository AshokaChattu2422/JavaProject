package day5_task;

import java.util.Arrays;

public class PositiveString {

	public static void main(String[] args) {
		String str="ANT";
		}
	  boolean isAlphabaticOrder1(String str){
		  int n=str.length();
		  char c[]=new char[n];
		  for(int i=0;i<n;i++){
			  c[i]=str.charAt(i);
		  }
		  Arrays.sort(c);
		  for(int i=0;i<n;i++){
			  if(c[i]!=str.charAt(i)){
				  return false;
			  }
			  return true;
		  }
			  if(isAlphabaticOrder1(str))
				  System.out.println("Yes");
			  else
				  System.out.println("No");
			return false;
				  
		  }
		
			  
	  

		
		}

	


