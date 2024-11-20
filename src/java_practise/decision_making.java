package java_practise;

public class decision_making {
	
	public static void car_door(boolean ans)
	{
		if(ans==true)
		{
			System.out.println("The status of door is open ="+ans);
		}
		else
		{
			System.out.println("The status of door is open ="+ans);
		}
		
	}
	
	public static void greater(int a, int b)
	{
		if (a>b)
		{
			System.out.println(+a+ "is greater than " +b);
		}
		else if (a==b)
		{
			System.out.println(+a+ "equal to " +b);
		}
		else 
		{
			System.out.println(+a+ "is lesser than " +b);
		}
	}
	
	public static void grade(char g)
	{
		switch(g)
		{
		case 'A': System.out.println("Distinction");
		break;
		case 'B': System.out.println("First class");
		break;
		case 'C': System.out.println("Second class");
		break;
		}
	}
	
	public static void main(String[] args)
	{
		car_door(false);
		greater(10, 20);
		grade('A');
	}

}
