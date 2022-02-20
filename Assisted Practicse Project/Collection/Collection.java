package Collection;

import java.util.*;
import java.io.*;
public class Collection {

	public static void main(String[] args) {
		// vector
		System.out.println("Vector");
		Vector<Integer> obj= new Vector();
		obj.addElement(null);
		obj.addElement(56);
		System.out.println(obj);
	

       //HashSet
		System.out.println("HashSet");
		HashSet<Integer> set= new HashSet<Integer>();
		set.add (233);
		set.add (67);
		System.out.println(set);
		
		// LinkedHashSet
		System.out.println("LinkedHashSet");
		LinkedHashSet<String> ooo= new LinkedHashSet<String>();
		ooo.add ("298");
		ooo.add ("689");
		System.out.println(ooo);
		
		//TreeSet
		System.out.println("TreeSet");
		TreeSet<Integer> set1= new TreeSet<Integer>();
		set1.add (233);
		set1.add (67);
		System.out.println(set);
		
		//LinkedList
		System.out.println("LinkedList");
		LinkedList<String> name= new LinkedList<String>();
	    name.add ("Shark");
		name.add ("Tank");
	    //Iteration 
		System.out.println("Iteration");
		Iterator<String>it= name.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		// ArrayList
			System.out.println("ArrayList");
			ArrayList<String>arr= new ArrayList<String>();	
			arr.add("Hello");
			arr.add("India");
			System.out.println(arr);
		}
	}
}

