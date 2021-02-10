class Airport
{
	String airportName;
	int noOfTerminals;
	String departure;
	String arrival;
	public static void main(String a[])
	{
		Airport airport=new Airport();
		airport.airportName="Kempegowda International Airport";
		airport.noOfTerminals=32;
		airport.departure="Bagalore";
		airport.arrival="Dubai";
		System.out.println("Airport name: "+airport.airportName+" ; No of Terminals Available: "+airport.noOfTerminals+" ; From  "+airport.departure+" to  "+airport.arrival);
		airport.checking();
	}
	void checking()
	{
		System.out.println("Checking the Passengers");
	}
}