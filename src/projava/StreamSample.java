package projava;

import java.util.List;
import java.util.stream.IntStream;

public class StreamSample {
	
	public static void main(String[] args)
	{
		var fruits = List.of("apple","banana","orange","pineapple");
		var stream = fruits.stream();
		stream.filter(x -> x.length() >= 6).map(x -> x.toUpperCase()).forEach(System.out::println);
		var stream2 = fruits.stream();
		System.out.println(stream2.filter(x -> x.length() >= 6).mapToInt(String::length).sum());
		
		 IntStream.iterate(0, x -> x<3,x -> x+1).forEach(x -> System.out.print(x + ":test ")); 
		 System.out.println();
		 IntStream.range(0,3).forEach(x -> System.out.print(x + ":test ")); 
		 
		 
	}

}
