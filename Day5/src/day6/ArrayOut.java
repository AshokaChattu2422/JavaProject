package day6;

public class ArrayOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	        int a[]=new int[10];
	        
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
	}

}
