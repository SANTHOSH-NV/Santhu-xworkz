class Boundary1
{
		public static void main(String a[])
		{
			int n =10;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(j==10||i==10||i+j==11) 		//left angle(Boundary)
						//if(i==1||j==10||i==j)       //reverse left angle(boundary)
						System.out.print(" * ");
					
					else
						System.out.print("   ");
				
				}
				System.out.println();
			
			}
		}
}
					