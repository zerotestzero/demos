package test;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		bubbleSort bs = new bubbleSort();
		
		int[] num = {1,5,4,3,2,17,13,10,8,0};
		num = bs.bubble(num);
		
		System.out.println("Before bubbleSort: " + Arrays.toString(num));
		System.out.println("-------------------");
		System.out.println(" After bubbleSort: " + Arrays.toString(num));
		
		
	}
}
