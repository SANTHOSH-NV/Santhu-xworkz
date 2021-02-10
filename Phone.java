class Phone
{
	static String songs = "MASS";
public static void main(String a[])
{
ring();
ring(songs);

}
public static void ring()
{
System.out.println("your ringtone is  set by default");
}
static void ring(String songs)
{
System.out.println("your ringtone is changed to " + songs+ " songs");
}
}