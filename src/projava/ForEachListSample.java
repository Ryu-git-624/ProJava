package projava;

import java.util.ArrayList;
import java.util.List;

public class ForEachListSample {
	
	public static void main(String[] args)
	{
		var names = List.of("yusuke","kis","sugiyama");
		
		for(var name : names)
		{
			System.out.println(name);
		}
		
		System.out.println();
		
		var namesArgs =  new String[]{"yusuke","kis","sugiyama"};
		for(var name : namesArgs)
		{
			System.out.println(name);
		}
		
		System.out.println();
		
		var fruits = List.of("apple","banana","graae");
		List<String> temp = new ArrayList<>();
		for(var fruit : fruits)
		{			
			if(fruit.length() == 5)
			{
				System.out.println(fruit);
				temp.add(fruit);
			}
		}
		System.out.println(temp.size());
		
		boolean isAll = false;
		boolean isAny = false;
		int cnt = 0;
		
		for(var check : temp)
		{
			if(check.contains("p"))
			{
				cnt++;
			}
		}
		
		if(cnt == temp.size())
		{
			isAll = true;
		}
		
		if(cnt > 0)
		{
			isAny = true;
		}
		
		System.out.println("全部；" + isAll);
		System.out.println("一部；" + isAny);
	}

}
