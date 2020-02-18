package com.busyqa.arrays;

public class Array {
	
	int property = 0;
	
	int property2 = 0;
	String property3 = "";

	
	void setProperty(int p) {
		property= p;
	}
	
	void setProperty(int p, int q) {
		property= p;
		property2 = q;
	}
	
	void setProperty(int p, String q) {
		property= p;
		property3 = q;
	}
	
	public static void main(String[] args) {
		
		Array arr = new Array();
		
		
		int[] array = new int[4];
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		
		for (int i=0; i <= array.length; i++) {
			//System.out.println(array[i]);
		}
		
		int[][] array2 = new int[3][2];
		
		int[] array3 = {1,2,3,4};
		
		int[][] array4 = {{1,2},{3,4},{5,6}};

		for (int i=0; i < 3; i++) {
			for (int j=0; j < 2; j++) {
				
				System.out.print(array4[i][j] + ",");
			}
			System.out.println("");
		}
		
		Integer[] b = new Integer[4];
	}

}
