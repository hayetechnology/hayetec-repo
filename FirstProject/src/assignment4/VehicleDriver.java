package assignment4;

public class VehicleDriver 
{

	public static void main(String[] args)
	{
		Vehicle v = new Vehicle("Jaguar" ,12, "John Doe");
		v.setVehicle("Geo", 2 , "Joe Smith");
		System.out.println(v.toString());
		System.out.println(v.getManufacturer());
		System.out.println(v.getCylinders());
		
	}

}
