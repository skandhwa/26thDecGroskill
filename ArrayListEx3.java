package CollectionsEx;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList<Object> li=new ArrayList<Object>();
		li.add("Orange");
		li.add(23);
		li.add(true);
		li.add(5600.5f);
		li.add(6600.5f);
		
		for(Object x:li)
		{
			System.out.println(x);
		}
		
		

	}

}
