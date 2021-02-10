class Phone2
{
	static long number = 8660247211L;
	static String name ="Santhosh kumar NV";
	static long num = 32;
	
public static void main(String a[])
{
	call(name);
System.out.println( " His phone num is "+number);
System.out.println( " He uses around "+num+" apps in his phone");
call(number);
call(num);
}
public static long call(long number)
{
return number;
}
static int call(int num)
{
	return num;
}
static void call(String name)
{
System.out.println(" The name of Developer is " +name);
}
}