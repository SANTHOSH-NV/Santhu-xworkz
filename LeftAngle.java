class LeftAngle
{
	public static void main(String a[])
	{
	for(int num=1;num<=4;num++)
		{
	for(int num1=1;num1<=4;num1++)
		{
		//if(num+ num1 == 5)       //Diagonal
			if(num +num1 >= 5)     //Left angle
				//if(num + num1 <= 5)    //reverse right angle
			{
			System.out.print("*"+"  ");
			}else
			{
			System.out.print("   ");
			}
		}
		System.out.println();
		}
	}
}