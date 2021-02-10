class Sandwich
{
public static void main(String a[])
{
String[] name={"Bread Sandwich","Cheese Sandwich","Chicken Sandwich","Egg Sandwich"};
double price[]={80.00,100.00,250.00,170.00};
System.out.println(" The length of Array is " + name.length);
for (int i=0;i<name.length;i++)
{
System.out.println("The Name & Price of Sandwich is " + name[i] + " ; Rs. " +  price[i]);
}
}
}