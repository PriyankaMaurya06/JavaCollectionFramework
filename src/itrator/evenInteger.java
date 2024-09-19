//WAJP to create a collection of integer and count the number of even integer numbers available in collection

package itrator;
import java.util.*;

public class evenInteger {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(85);
		c1.add(7);
		c1.add(34);
		c1.add(11);
		c1.add(77);
		c1.add(3);
		c1.add(5);
		c1.add(64);
		c1.add(20);
		
		System.out.println(c1);
		int count = 0;
		
		Iterator itr = c1.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			int n = (int)o;
			if(n%2==0)
				count++;
			
			
		}
		System.out.println("Total even integer numbers are : "+count);
	}

}
