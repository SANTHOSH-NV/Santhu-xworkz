class Triangle
{
	public static void main(String a[])
	{
		
		starAngle(15);
	}
  static void starAngle(int n)
  {
	  		int k=(n/2);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	//if(i==k || i+j==k || j-i==k){        // Upper Triangle
					//if(i==k || i-j==k || i+j==(k*3)){          // Lower Triangle
			if(i==k || i+j==k || i-j==k || j-i==k || i+j==(k*3)){     // Diamond
			System.out.print("*");}
			else{
			System.out.print(" ");
			}
			
		}
		System.out.println();
		
	}
}
}
