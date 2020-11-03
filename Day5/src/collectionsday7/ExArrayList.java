package collectionsday7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arraylistA=new ArrayList<Integer> ();
		ArrayList <String> arraylistB=new ArrayList<String>();
		for(int i=0;i<5;i++){
			arraylistA.add(i);
			
		}
		System.out.println(arraylistA);
		arraylistB.add("Beginner");
		arraylistB.add("Java");
		arraylistB.add("tutorial");
		arraylistB.add(".");
		arraylistB.add(3,"com");
		arraylistB.add("java");
		arraylistB.add("site");
		System.out.println("Second Element is "+arraylistB.get(2));
		arraylistB.remove("java");
		System.out.println("ArrayListB after  "+arraylistB);
		Iterator<Integer> il=arraylistA.iterator();		
		System.out.print("Arraylist arraylistA  -->");
		while(il.hasNext());
		{
			System.out.print(il.next() + "  ");
		}
		System.out.println();
		System.out.print("ArrayListarraylistA --->");
		for(int j=0;j<arraylistA.size();j++){
			System.out.print(arraylistA.get(j)+ " ");
			
		}
		System.out.println();
		
		System.out.print("Sorted ArrayList arraylistA -->");
		Collections.sort(arraylistA);
		System.out.print("arraylistA");
		Integer a[]={11,12,13,14,15};
		List<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println("arrlist "+arrlist.get(0));
		

	}

}
