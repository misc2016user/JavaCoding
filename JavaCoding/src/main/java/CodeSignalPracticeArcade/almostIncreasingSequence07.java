package CodeSignalPracticeArcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class almostIncreasingSequence07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1, 3, 2, 1};
		System.out.println("The answer is: "+ almostIncreasingSequenceMethod(a));
	}

public static boolean almostIncreasingSequenceMethod(int[]a) {
	int count=0;
	ArrayList<Integer> al= new ArrayList<Integer>();
	
	for(int i=0;i<a.length;i++) {
	al.add(a[i]);	
	}
	
	for(int i=0;i<al.size()-1;i++) {
		if(al.get(i)>al.get(i+1)) {
			al.remove(i);
		}
	}
	
	Arrays.sort(a);
	
ArrayList<Integer> original= al;
Collections.sort(al);
	return al.equals(original)	;
	
	
	
	
}
	
}
