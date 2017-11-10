package assignment4;

public class Truck extends Vehicle
{
  private double load;
  private int capacity;
  
  public Truck(String name, int cylinders, String carOwner, double load,  int capacity)
  {
    super(name, cylinders, carOwner);
    this.capacity = capacity;
    this.load = load;
  }
 
  public Truck(Truck originalTruck)
  {
    super(originalTruck);
    load = originalTruck.load;
    capacity = originalTruck.capacity;
  }
  public boolean equals(Truck otherTruck)
 	{
 	    if (otherTruck == null)
 	        return false;
 	    else
 	        return ( (super.equals(otherTruck)) &&
 	            (load == otherTruck.load) && (capacity == otherTruck.capacity));
   }
  
  public double getLoad()
  {
    return load;
  }

  public int getcapacity()
  {
    return capacity;
  }
}
