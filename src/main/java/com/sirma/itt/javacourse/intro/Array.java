package com.sirma.itt.javacourse.intro;
public class Array {

	/**
	 * @param args
	 */
	
	public static int getMinElement(int [] array) {
		int minElem=2147483647;	//the maximum of integer
		for(int i=0;i<array.length;i++) {
			if(minElem>array[i]) {
				minElem=array[i];
			}
		}
		return minElem;
	}
	public static int getSum(int [] array) {
		int sum=0;
		for (int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum;
	}
	public static void printArray(int [] array){
		System.out.println("The elements of the array:");
		for(int i=0;i<array.length;i++){
			System.out.printf(" "+array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,5,6,7,8,9,8,7,6,5};
		int minEl=0;
		int sumArr=0;
		minEl=getMinElement(array);
		System.out.println("The minimum element of the array: "+minEl+".");
		sumArr=getSum(array);
		System.out.println("The sum of all the elements of the array is: "+sumArr+".");
		printArray(array);
	}
}
