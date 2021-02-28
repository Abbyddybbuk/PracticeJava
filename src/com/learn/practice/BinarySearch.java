package com.learn.practice;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int numSearch = 3;        
		executeBinarySearch(numSearch, 0, intArray.length - 1, intArray); 
	}
	
	public static int executeBinarySearch(int key, int start, int end, int tempArray[]) {
		if (start > end)
			return -1;
		
		int mid = findMid(start, end);
		if (tempArray[mid] == key) {
			System.out.println(tempArray[mid]);
			return tempArray[mid];
		} else if (key < tempArray[mid]) {
			executeBinarySearch(key, start, mid - 1, tempArray);
		} else if (key > tempArray[mid]) {
			executeBinarySearch(key, mid + 1, end, tempArray);
		}		
		return -1;
	}
	
	public static int findMid(int start, int end) {
		return (start + end) / 2;
	}

}
