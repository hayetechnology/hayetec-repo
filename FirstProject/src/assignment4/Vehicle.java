package assignment4;

public class Vehicle
{
  public String name;
  private int cylinders;
  public Person owner;
  public Person nobody = new Person("nobody");
 
  public Vehicle(String name, int cylinders, String carOwner)
  {
    this.name = name;
    this.cylinders = cylinders;
   	this.owner =  new Person(carOwner);
  }
  
  public Vehicle()
  {
	  this.name = "unknown";
	  this.cylinders = 0;
	  this. owner = nobody;
  }

  
  public Vehicle(Vehicle originalVehicle)
  {
    name = originalVehicle.name;
    cylinders = originalVehicle.cylinders;
    owner = originalVehicle.owner;
  }
  public void setVehicle(String name, int cylinders, String carOwner)
  {
	  this.name = name;
	  this.cylinders = cylinders;
	  this.owner = new Person(carOwner);
  }
  
  public boolean equals(Vehicle otherVehicle)
	{
	    if (otherVehicle == null)
	        return false;
	    else
	        return ( (name.equals(otherVehicle.name)) &&
	            (cylinders == otherVehicle.cylinders) &&
	            (owner .equals(otherVehicle.owner)));
  }

  
  public String getManufacturer()
  {
    return name;
  }

  public int getCylinders()
  {
    return cylinders;
  }
  
  
  public String toString()
  {
	  return(  name +  " ("  + cylinders +  " cylinders)  " 
			  									+ "owned by " + owner);
  }
}
