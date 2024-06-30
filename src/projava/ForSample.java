package projava;

public class ForSample {
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Hello");
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(i);
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i);
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++)
		{
			if(i == 3)
			{
				continue;
			}
			
			System.out.print(i);
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++)
		{
			if(i == 3 || i == 5)
			{
				continue;
			}
			
			System.out.print(i);
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++)
		{
			if(i > 2 && 7 > i)
			{
				continue;
			}
			
			System.out.print(i);
		}
		
	}

}
