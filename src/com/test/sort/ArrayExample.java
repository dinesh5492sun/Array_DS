package com.test.sort;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arrayOfInt=new int[7]; 
		//Array size will not increase dynamically we need to initialize the size of array
		//as it store arrays data in contiguous block in memory
		
		//in int in java is of 4 byte
		//every element occupies the same amount of space in memory
		arrayOfInt[0]=11;
		arrayOfInt[1]=12;
		arrayOfInt[2]=13;
		arrayOfInt[3]=14;
		arrayOfInt[4]=15;
		arrayOfInt[5]=16;
		arrayOfInt[6]=17;
	//	arrayOfInt[7]=18; //you will get ArrayIndexOutOfBoundsException Array always start with zero 0
		System.out.println("length of array"+arrayOfInt.length);
		for(int i=0;i<arrayOfInt.length;i++) {
			System.out.println("=>"+arrayOfInt[i]);
		}
		
		
		int index=-1;
		for(int i=0;i<arrayOfInt.length;i++) {
			if(arrayOfInt[i] == 14) {
				index=i;
				break;
			}
		}
		System.out.println("index "+index);
		//in case we don't know the index and we need to search for element 14 ...what would be the Time complexity
		//worst case we need to go through full loop so => O(n) linear
		
		//Add an element to a full array
		int[] arrayOfInt1=new int[arrayOfInt.length+1];
		for(int i=0;i<arrayOfInt1.length;i++) {
			if(i<arrayOfInt.length) {
				arrayOfInt1[i]=arrayOfInt[i];
			}else {
				arrayOfInt1[i]=1;
			}
			
		}
		for(int i=0;i<arrayOfInt1.length;i++) {
			System.out.println("=>"+arrayOfInt1[i]);
		}
		/*
		ArrayList al =new ArrayList();
		al.add(1);
		al.add("String");
		for(int i=0;i<al.size();i++) {
			System.out.println("=>"+al.get(i));
		}
		System.out.println("al"+al.size());*/
	}
}
