/* implement FailFast Exception */

import java.util.ArrayList;

public class FailFastImplementation
{
	public static void main(String x[])
	{
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		for(Integer obj : al)
		{
			if(obj==300)
			{
				al.remove(obj);
			}
			System.out.println(obj);
		}	
	}
}