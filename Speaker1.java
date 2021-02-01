class Speaker
{
static int minvol=5;
static boolean isConnected= true;
static int currentVol=30;
static String brandName;
static double price;
public static void main(String a[])
{
brandName="Creative";
price=4000.0;
System.out.println("Name of speaker is = "+ brandName);
System.out.println("price = "+price);
decreaseVol();
decreaseVol();
}
public static void decreaseVol()
{
if(isConnected)
{
   if(currentVol>minvol)
{
currentVol=currentVol-5;
}}
System.out.println("currentVolume is "+ currentVol);
}
}
