class Flights2
{
static	String FlightsNames[]={"KingFisher","Indigo","Deccan","SpiceJet"};
public static void main(String a[])
{

fetchFlightsNames();
}
		public static void fetchFlightsNames()
		{
for (int i=0;i<FlightsNames.length;i++)
{
System.out.println(FlightsNames[i]);
}
}
}