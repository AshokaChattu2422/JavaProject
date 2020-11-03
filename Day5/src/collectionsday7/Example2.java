package collectionsday7;
import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>hashMap=new HashMap<String,Integer>();
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hashMap.put(null,new Integer(1));
		hashMap.put("Two",new Integer(2));
		hashMap.put("three",new Integer(3));
		hashMap.put("three",new Integer(5));
		hm.putAll(hashMap);
		System.out.println(hashMap);
		System.out.println("HashMap contains "+hashMap.size() +"key value pairs ");
		if(hashMap.containsValue(new Integer(1))){
			System.out.println("HashMap contains 1 as Value");
		}
			else
			{
				System.out.println("hashMap doesnot contain 1 as" +"value");
				
			}
		
	System.out.println("Retriving all keys from " +"the HashMap");
	Iterator<String> iterator=hashMap.keySet().iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}	
	System.out.println("Retriving all keys value pairs" +"the HashMap");
	Iterator<Map.Entry<String, Integer>> itr=hashMap.entrySet().iterator();
	while(itr.hasNext());{
		System.out.println(itr.next());
	}
	System.out.println("Hash Maps values");
	Iterator<Integer > i=hashMap.values().iterator();
	while(i.hasNext()){
		System.out.println(i.next());
		
	}
	System.out.println("Using enhanced for loop");
	for(String aKey:hashMap.keySet()){
		
	
			Integer aValue=hashMap.get(aKey);
			System.out.println(""+aKey +" :"+aValue);
	}	
	System.out.println("Using enhanced for loop and Map");
	for(Map.Entry<String, Integer> m:hashMap.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	

	}

}
