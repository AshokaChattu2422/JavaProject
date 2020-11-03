package day6;
class MyNameException extends Exception{
	public String toString(){
		return "Age can not be negative";	
		}
}

public class Example {
	 static int getAge(){
		return -10;
		
	}

	public static void main(String[] args)  //throws MyName 
	{
		// TODO Auto-generated method stub
		int age= getAge();
		try
		{
			if(age <0)
				throw new MyNameException();
			else
				System.out.println("Age is "+age);
		}
		catch(MyNameException e)
		{
			System.out.println(e);
		}
	}
	

}
