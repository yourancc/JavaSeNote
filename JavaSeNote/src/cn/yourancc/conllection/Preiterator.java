package cn.yourancc.conllection;

import java.util.ArrayList;
import java.util.Iterator;

public class Preiterator {

	
	public static void main(String []args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			int i = (int) it.next();
			if(i==2) {
				it.remove();
				//list.remove(1);´íÎó
			}
			
			System.out.println(i);
		}
		System.out.println(list.size());
	}
}
