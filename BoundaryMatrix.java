class BoundaryMatrix
{
		public static void main(String a[])
		{
			int n=8;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					
				//if(j==1 || i==8|| i==j){    //right angle(boundary)
					if(i==1||j==1||i+j==9){    //reverse right angle(boudary)
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				System.out.println();	
			}
		}
}
					