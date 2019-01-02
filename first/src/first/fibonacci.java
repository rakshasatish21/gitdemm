package first;

public class fibonacci 
{
	public static void main(String[] args)
	{
		int fb0=0,fb1=1,fb2;
		System.out.println("fibonaccci series: ")
		System.out.print("0 1 ");
		
		for(int i=1;i<=10;i++)
		{
			fb2=fb0+fb1;
			System.out.print(fb2+" ");
			fb0=fb1;
			fb1=fb2;
		}
		
	}

}
