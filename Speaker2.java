class Speaker
{
static int minvol=5;
static int currentVol=15;
static String brandName;
static double price;
public static void main(String a[])
{
brandName="Pioneer";
price=6000.0;
System.out.println("Name of speaker is = "+ brandName);
System.out.println("price = "+price);
decreaseVol();
decreaseVol();
}
public static void decreaseVol()
{
if(isConnected())
{
   if(currentVol>minvol)
{
currentVol=currentVol-3;
}}
System.out.println("currentVolume is "+ currentVol);
}
public static boolean isConnected()
{
return true;

}
}