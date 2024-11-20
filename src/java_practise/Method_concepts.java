package java_practise;

public class Method_concepts {
	
	public static boolean m1()
	{
		System.out.println("Hi");
		return false;
	}
	
	public static int m2()
	{
		return 30;
	}
	
	public static int m3()
	{
		int a=1,b=2,c=a+b;
		return c;
	}
	
	public static char m4()
	{
		return 'V';
	}
	
	public static String addition()
	{
		int n1=10;
		int n2=20;
		int n3=n1+n2;
		System.out.println("result is "+n3);
		return null;
	}
	
	public static int square_of_number(int num)
	{
		int res = num*num;
		return res;
	}
	
	public static int simple_interest(int p,int r, int t)
	{
		int si=p*r*t/100;
		return si;
	}
	
	public static void main(String[] args)
	{
		System.out.println(m1());
		System.out.println(m2());
		System.out.println(m3());
		int mthree = m3();
		System.out.println(mthree);
		System.out.println(m4());
		String res = addition();
		int square = square_of_number(2);
		System.out.println(square);
		int result=simple_interest(100,200,300);
		System.out.println(result);
	}

}
