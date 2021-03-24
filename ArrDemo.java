package src.classes.informatik1;

import java.util.ArrayList;
import java.util.Random;

public class ArrDemo {
	
	int[][] matrix;
	int[] intArrDemo;
	ArrayList<Integer> arrListInts;
	Random r;
	
	public ArrDemo() {
		r= new Random();
		matrix = new int[3][3];
		arrListInts = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++) {
			arrListInts.add(r.nextInt(50));
		}
	}
	
	private void sort(ArrayList<Integer> toSortArray) {
		int i = 0;
		
		while (i < toSortArray.size() - 1) {
			if (toSortArray.get(i) > toSortArray.get(i + 1)) {
				Integer swap = toSortArray.get(i);
				toSortArray.set(i, toSortArray.get(i + 1));
				toSortArray.set(i + 1, swap);
				
				if (i > 0) {
					i--;
				}
			} else {
				i++;
			}
		}
	}
	
	private void sort(int[] toSortArray) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while (i < toSortArray.length - 1) {
			if (toSortArray[i] > toSortArray[i + 1]) {
				int swap = toSortArray[i];
				toSortArray[i] = toSortArray [i + 1];
				toSortArray[i + 1] = swap;
				
				if (i > 0) {
					i--;
				}
			} else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrDemo a = new ArrDemo();
		
		System.out.println(a.arrListInts);
		
		a.sort(a.arrListInts);
		
		System.out.println(a.arrListInts);
	}
}
