package Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<String> t=new ArrayList<>();
	t.add("Arjun");
	t.add("Sai");
	t.add("Bharat");
	System.out.println(t);
	Iterator <String>it=t.iterator();
	while(it.hasNext()){
		String name=it.next();
		if(name.toUpperCase().contains("A")) {
			it.remove();
		}
	}
	System.out.println(t);
	
}
}
