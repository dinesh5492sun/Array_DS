package com.test.sort;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
	
		/*
		int[] ArrayofElement=new int[]{20,35,-15,7,55,1,-22};
		int temp=0;
		for(int i=ArrayofElement.length-1;i>0;i--) {
			
			for(int j=1;j<i+1;j++) {
				
				if(ArrayofElement[j-1]>ArrayofElement[j]) {
					temp=ArrayofElement[j];
					ArrayofElement[j]=ArrayofElement[j-1];
					ArrayofElement[j-1]=temp;
				}
					
			}
			System.out.println("=>"+Arrays.toString(ArrayofElement));
		}
		*/
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex >0;lastUnsortedIndex--) {
			for(int i=0;i<lastUnsortedIndex;i++) {
				if(intArray[i]>intArray[i+1]) {
					swap(intArray,i,i+1);
				}
			}
		}
		
		System.out.println("=>"+Arrays.toString(intArray));
		
		
	}
	public static void swap(int[] array,int i,int j) {
		if(i == j) {
			return;
		}
		
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
