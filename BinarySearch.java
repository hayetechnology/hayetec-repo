package firstPackage;

public class BinarySearch 
{
	public static int key = 13;
	public static int[] element = new int[10];
	static int left = 0;
	static int mid;
	static int right = element.length-1;
	
	public static void main(String[] args) 
	{
		for (int i = 0; i < element.length; i++)
		{
			element[i] = i;
		}
		if (binarySearch(key, element)== -1)
		{
			System.out.println(" number " + key + " is not"
					+ " in the array");
		}
		else 
		{
			System.out.println(key  + " is in slot number " + mid + "th slot of the array");
		}
	}
	
	public static int binarySearch(int key, int [] element)
	{
		
		int j = 0;
		while(true)
		{
			if(left > right)
			{
				
				return -1;
			}
			else
			{
				mid = (left + right)/2;
			}
			
			if(key < mid)
			{
				right = mid - 1;
			}
			else if (key > mid)
			{
				left = mid + 1;
			}
			else
			{
				return mid;
			}
		}
	}
}
