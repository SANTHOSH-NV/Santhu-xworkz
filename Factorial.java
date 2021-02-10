class Factorial
{
public static void main(String a[])
{
myFact(11);
}
public static void myFact(int number)
{
int fact=1;
for(int i=1;i<=number;i++)
{
	fact = fact * i;

}
System.out.println(fact);
}
}