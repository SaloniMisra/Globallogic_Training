package com.globallogic.Search;

public class Binary {
	public static void checkBina(int low, int high, int key, int[] arr) {

		
		while (low <= high) {
			int mid = (low + high)/2;
			if (arr[mid] < key)

			{
				low = mid + 1;

			} else if (arr[mid] == key) {
				System.out.println(mid +" is index of key"); 
				break;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("not present");

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int key = 5;
		int low = 0;
		int high = arr.length - 1;
		checkBina(low, high, key, arr);
	}

}
