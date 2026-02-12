/*methods of the List Interface */

import java.util.List;
import java.util.ArrayList;

public class ListInterfaceMethods
{
	public static void main(String x[])
	{
		List list = new ArrayList();
		list.add(100); //index 0
		list.add(200); //1
		list.add(300); //2
		list.add(400);  //3
		list.add(500);	 //4
		list.add(300);  //5
		list.add(300); //6

		//Object obj = list.get(2);
		//System.out.println(obj);

		//System.out.println("========");
		//System.out.println(list);

		//list.set(1,1756);
		//System.out.println(list);

		//list.remove(2);
		//System.out.println(list);

		System.out.println(list);
		System.out.println("First Index : "+list.indexOf(300));

		System.out.println("Last Index : "+list.lastIndexOf(300));

		List newList = list.subList(2,5);
		System.out.println(newList);
		
	}
}