package com.test.sort;

import java.util.Arrays;

public class SelectionSort {

		public static void main(String[] args) {
			
			int[] intArray = {20,35,-15,7,55,1,-22};
			
			
			for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
				int largest=0;
				for(int i=1;i <=lastUnsortedIndex;i++) {
					if(intArray[i] > intArray[largest]) {
						largest=i;
					}
				}
				swap(intArray,largest,lastUnsortedIndex);
			}
			
			/*int num=0;
			 
			for(int i=0;i<intArray.length;i++) {
				for(int j=1;j<intArray.length-i;j++) {
					if(intArray[num]<intArray[j]) {
						num=j;
					}
				}
				swap(intArray,num,intArray.length-i-1);
			}*/
			System.out.println(Arrays.toString(intArray));
			System.out.println("comming");
		}
		
		public static void swap(int[] array,int i, int j) {
			
			int temp= array[i];
			array[i]=array[j];
			array[j]=temp;
		}
}
