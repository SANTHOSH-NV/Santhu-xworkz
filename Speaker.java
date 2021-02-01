class Speaker
{
static int maxvol=40;
static boolean isConnected=true;
static int currentVol=20;
static String brandName;
static double price;
public static void main(String a[])
{
brandName="Creative";
price=4000.0;
System.out.println("Name of Speaker is "+ brandName);
System.out.println("price = "+price);
increaseVol();
increaseVol();
}
public static void increaseVol()
{
if(isConnected)
{
   if(currentVol<maxvol)
{
currentVol=currentVol+5;
System.out.println("currentVolume is "+ currentVol);

}
}
}}