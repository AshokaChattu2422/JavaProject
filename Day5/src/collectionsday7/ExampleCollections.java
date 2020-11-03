package collectionsday7;
import java.util.*;
public class ExampleCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s=new HashSet<String>();
		s.add("Beginners");
        s.add("Java");
        s.add("Java");
		s.add("Tutorials  ");
		
		System.out.print("elements as a set"+s);
		System.out.println("\n s.contains Java" +s.contains("Java"));
				TreeSet<String> t=new TreeSet<String>(s);
		System.out.println("t.equals s "+t.equals(s));
		Iterator<String> itr=t.iterator();
		System.out.println("Iteratation Type 1");
		while(itr.hasNext()){
			String e=(String)itr.next();
			System.out.println(e);
			}
		System.out.println("Iteratation Type 2");
		for(String o:t)
			System.out.println(o);
	}

}
