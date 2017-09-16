package test;

public class bubbleSort {
	
	int[] bubble(int[] num) {
		boolean swapped = true;
		int length = num.length;
		do {
			swapped = false;
			for(int x = 0; x < length; x++) {
				if(x != length-1 && num[x] > num[x+1]) {
					int temp = num[x];
					num[x] = num[x+1];
					num[x+1] = temp;
					swapped = true;
				}
			}
			
		}while(swapped);
		
		return num;
	}
	
//	public static void main(String[] args) {
//		int[] theNums = {1,5,3,4,2,8,0,19,11,4};
//		theNums = bubble(theNums);
//		
//		System.out.println("Before bubbleSort: " + Arrays.toString(theNums));
//		System.out.println("-------------------");
//		System.out.print(" After bubbleSort: " + Arrays.toString(theNums));
//	}
//	
//	static int[] bubble(int[] num) {
//		boolean swapped = true;
//		int length = num.length;
//		do {
//			swapped = false;
//			for(int x = 0; x < length; x++) {
//				if(x != length-1 && num[x] > num[x+1]) {
//					int temp = num[x];
//					num[x] = num[x+1];
//					num[x+1] = temp;
//					swapped = true;
//				}
//			}
//			
//		}while(swapped);
//		
//		return num;
//	}
}
