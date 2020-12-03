package javaavtivity10;

import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet<String>();
		hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");
        
        Iterator<String> it = hs.iterator();
        while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		hs.remove("X");
		
		hs.remove("Name");
		
		System.out.println("A is present in the set: "+hs.contains("A"));
		
		System.out.println(hs);
		

	}

}
