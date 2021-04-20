class Diamond
{
	public static void main(String a[])
	{
		int n=7 ,k=(n/2);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==k || j-i==k || i-j==k || i+j==(k*3))
			System.out.print("*");
			else
			System.out.print(" ");
			}
		
		System.out.println( );
		}
	}
}
