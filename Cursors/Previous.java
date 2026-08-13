package Cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Previous {
public static void main(String[] args) {
	List<String> t=new ArrayList<>();
	t.add("Arjun");
	t.add("sai");
	t.add("kushal");
	System.out.println(t);
	ListIterator <String> lt=t.listIterator(t.size());
	while(lt.hasPrevious()) {
		System.out.println(lt.previous());
	}

}

}
