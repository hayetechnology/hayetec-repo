package Assignment4One;

public class Truck extends Vehicle
{
  private double load;
  private int capacity;
  
  public Truck(String name, int cylinders, String carOwner, double load,  int capacity)
  {
    super(name, cylinders, carOwner);
    this.load = load;
    this.capacity = capacity;
  }
  
  public Truck()
  {
	  super();
	  this. load = 0;
	  this.capacity = 0;
  }

 
  public Truck(Truck originalTruck)
  {
    super(originalTruck);
    load = originalTruck.load;
    capacity = originalTruck.capacity;
  }
  
  public void setTruck(String name, int cylinders, String carOwner, double load,  int capacity)
  {
	  this.name = name;
	  this.cylinders = cylinders;
	  this.owner = new Person(carOwner);
	  this.load = load;
	  this.capacity = capacity;
  }
  
  public double getLoad()
  {
    return load;
  }

  public int getCapacity()
  {
    return capacity;
  }
  
  public boolean equals(Truck otherTruck)
  {
	    if (otherTruck == null)
	        return false;
	    else
	    	return ( (super.equals(otherTruck)) &&
	            (load == otherTruck.load) && (capacity == otherTruck.capacity));
  }
  
  public String toString()
  {
	  return(  name +  " ("  + cylinders +  " cylinders  " 
			  				 + load + " ton load, " + capacity 
			  				 + " ton towing capacity)" + " owned by " + owner );
  }
}
