package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  l=new ArrayList<Integer>();
		l=Arrays.asList(3,4,5,6);
		l.forEach(i->
			{System.out.println(i);
			});		
		System.out.println();
		l.forEach (System.out::println);
			
		


	}
}


