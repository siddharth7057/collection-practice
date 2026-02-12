/* methods of the Collection Interface */

import java.util.Collection;
import java.util.ArrayList;

public class CollectionInterfaceMethods
{	
	public static void main(String x[])
	{
		Collection c = new ArrayList();

		//adding elements.
		c.add(10);  //0
		c.add(20);  //1
		c.add(30);  //2
		c.add(40);  //3
		c.add(50);   //4
	
		//determine the size of the collection.
		int size = c.size();
		System.out.println("Size : "+size);

		//isEmpty() method
		if(c.isEmpty())
		{
			System.out.println("Collection is empty.");
		}
		else
		{	
			System.out.println("Collection is not empty.");
		}

		//contains() method
		boolean available = c.contains(50);
		if(available)
		{
			System.out.println("Element found.");
		}
		else
		{
			System.out.println("Element not found.");
		}

		//remove() method
		if(c.remove(30))
		{
			System.out.println("Element removed.");
		}
		else
		{
			System.out.println("Element not found.");
		}

		System.out.println("======================");
		System.out.println(c);

		//containsAll() method

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);

		if(c.containsAll(list))
		{
			System.out.println("list is a part of collection c.");
		}
		else
		{
			System.out.println("list is NOT a part of collection c.");
		}
		

		//addAll() method
		ArrayList al = new ArrayList();
		al.add(69);
		al.add(79);

		if(c.addAll(al))
		{
			System.out.println("All elements of ArrayList al added to Collection c.");
		}
		else
		{
			System.out.println("Elements not added.");
		}

		System.out.println("=========");
		System.out.println(c);
		
		//removeAll() method.
		if(c.removeAll(al))
		{		
			System.out.println("All elements of al removed.");
		}
		else
		{
			System.out.println("Elements not removed.");
		}
		
		System.out.println("=========");
		System.out.println(c);

		//clear() method.
		c.clear();
		System.out.println("=====After clearing====");
		System.out.println(c);

		
	}
}