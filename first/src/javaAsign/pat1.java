package javaAsign;
/*
 *   1 2 3 4 5 
 *   1 2 3 4 5
 *   1 2 3 4 5
 *   1 2 3 4 5
 *   1 2 3 4 5
 * 
 * 
 * 
 */
public class pat1 {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(j+1);
		}
		System.out.println();
	}
}
}