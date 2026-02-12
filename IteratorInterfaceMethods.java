/* methods of the Iterator interface */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class IteratorInterfaceMethods
{
	public static void main(String x[])
	{
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		
		Iterator it = c.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}