class Phone
{
static double price = 25000.00;
public static void main(String a[])
{
ring(price);
System.out.println("Price is "+price);
ring();
ring("MASS");

}
public static double ring(double price)
{
return price;
}
public static void ring()
{
System.out.println("your are set to default ringtone");
}
static void ring(String songs)
{
System.out.println("your ringtone is changed to " + songs+ " songs");
}
}