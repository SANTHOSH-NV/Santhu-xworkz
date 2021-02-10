class Paint
{
static String name[]={"Asian paints","Berger paints","Nippon paints"};
static String[] typesOfPaints={"Primer","Oil & Water based","Interior","Exterior","Enamel"};
public static void main(String[] a)
{
	System.out.println("The length of array is "+ typesOfPaints.length);
for (int i=0;i<3;i++)
{
System.out.println("The name of Paint is " + name[i]);
}
for(int i=0;i<typesOfPaints.length;i++)
{
	System.out.println("The Type of Paint is " + typesOfPaints[i]);
}
}
}
