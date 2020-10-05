package CodeSignalPracticeArcade;

import java.util.HashSet;
import java.util.Iterator;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {2,3,4,5,6,6,2};
		remove(a);

	}

	public static void remove(int[]a) {
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int i:a) hs.add(i);
		
		Iterator<Integer> it= hs.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
		
		
		
	}
	
}
