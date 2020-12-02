package javaactivity9;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Shibashis1");
		myList.add("Shibashis2");
		myList.add("Shibashis3");
		myList.add("Shibashis4");
		myList.add("Shibashis5");
		
		for (String str : myList) {
			System.out.println(str);
		}
		
		System.out.println(myList.get(2));
		
		System.out.println("Is Chicku is in list: " + myList.contains("Shibashis3"));
		
		System.out.println(myList.size());
		
		myList.remove("Shibashis3");
		System.out.println(myList);
		System.out.println(myList.size());
		
		

	}

}
