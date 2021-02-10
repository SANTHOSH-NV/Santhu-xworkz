class Medicine
{
static String name="Paracetamol";
static int price= 20;
static short mg=500;
static boolean isIsiCertified;
public static void main(String a[])
{
	toCure();
	toCure(price);
	toCure(mg);
	toCure(isIsiCertified = true);
	}
public static void toCure()
{
System.out.println("The medicine name is "+name);
}
static void toCure(int price)
{
System.out.println("The price is "+price);
}
public static short toCure(short mg)
{
System.out.println("The medicine is of "+mg +" mg");
return mg;
}
 static boolean toCure(boolean isIsiCertified)
{
System.out.println("Is Medicine ISI Certified =  "+isIsiCertified);
return isIsiCertified;
}

}