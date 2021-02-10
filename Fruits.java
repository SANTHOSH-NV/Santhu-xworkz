class Fruits
{
	String name;
	double price;
	public static void main(String a[])
	{
		Fruits fruit = new Fruits();
		fruit.name="Apple";
		fruit.price=150.00;
		System.out.println("Fruit Name is : "+fruit.name +"; price Rs. "+ fruit.price);
			Fruits fruit1 = new Fruits();
			fruit1.name="Orange";
			fruit1.price=60.00;
			System.out.println("Fruit Name is : "+fruit1.name +"; price Rs.  "+ fruit1.price);
		Fruits fruit2 = new Fruits();
		fruit2.name="Grapes";
		fruit2.price=65.00;
		System.out.println("Fruit Name is : "+fruit2.name +"; price Rs.  "+ fruit2.price);
			Fruits fruit3 = new Fruits();
			fruit3.name="banana";
			fruit3.price=75.00;
			System.out.println("Fruit Name is : "+fruit3.name +"; price Rs.  "+ fruit3.price);
			fruit.healthy();
	}
	void healthy()
	{
		System.out.println("Health is wealth");
	}
}
		