package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList(new String []{"ashoka"});
		List newList=words.stream().map(str->str.length()).collect(Collectors.toList());
				System.out.println(newList);
		
		List<Integer> ls=Arrays.asList(new Integer []{13,14,13,25,14,6});
	//List ls1=ls.stream().filter(i->i>10).collect(Collectors.toList());
	List ls1=ls.stream().filter(i->i>10).distinct().collect(Collectors.toList());	
System.out.println(ls1);
		Stream.of(23,65,8).reduce((a,b)->a+b).ifPresent(System.out::println);
		List<Integer> as=Arrays.asList(3,16,9,70);
			Optional<Integer> as1=as.stream().reduce((x,y)->x>y?x:y);
			if(as1.isPresent()){
				System.out.println("Results  " +as1.get());
			}
}
}