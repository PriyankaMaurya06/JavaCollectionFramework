package itrator;

import java.util.*;

public class Itrator1 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("abcd");
		c1.add("xyzpqr");
		c1.add("aaa");
		c1.add("bd");
System.out.println("All the Elements are :"+c1);
		int count=0;
		String s_st=""; 
		String big_st="";
      Iterator itr = c1.iterator();
      
      
      while(itr.hasNext())
      {
    	  Object o = itr.next();
    	  if(o instanceof String) {
    		  String temp = (String)o;
    		  count++;
    		  if(count == 1)
    			  s_st=temp;
    		  if(temp.length()>big_st.length())
    			  big_st=temp;
    		  if(temp.length()<s_st.length())
    			  s_st=temp;
    	  }  
      }
      System.out.println("Big String is : "+big_st);
      System.out.println("Big String is : "+s_st);
 }

}
