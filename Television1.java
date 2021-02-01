class Television
{
static String company;
static double price;
static int inches;
static int maxVol;
static int minVol;
static int currentVol;
static boolean isSwitchOn;
public static void main(String a[])
{
company = "Samsung";
price = 35999.0000;
inches = 42;
maxVol = 100;
minVol = 10;
currentVol = 95; 
System.out.println("The Television company is "+ company);
System.out.println("The Television is of "+ inches+ " inches");
System.out.println("The Television price is Rs."+ price+ "  (limited offer)");
increaseVol();
increaseVol();
increaseVol();
}
public static void increaseVol()
{
if(isSwitchOn())
{
	       if(currentVol<maxVol)
		   {
            currentVol = currentVol+5;
		   }
		        if(currentVol==maxVol)
				{
					currentVol = minVol+10;
				}
	 }
System.out.println("Current volume is = "+ currentVol);
}
public static boolean isSwitchOn()
{
	return true;
}
}