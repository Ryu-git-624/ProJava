package projava;

import java.util.List;

public class LambdaSample {
	
	public static void main(String[] args)
	{

	}
	
	boolean check(String s)
	{
		List<String> list = List.of(s);
		list.stream().filter(x -> x.contains("y"));
		
		return s.contains("y");
	}
}
