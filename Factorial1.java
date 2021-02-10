class Factorial
{
public static void main(String a[])
{
myfact(6);
}
public static void myfact(int number)
{
int fact=1;
int i=1;
while(i <= number)
{
fact = fact*i;
i++;
}
System.out.println(fact);
}
}