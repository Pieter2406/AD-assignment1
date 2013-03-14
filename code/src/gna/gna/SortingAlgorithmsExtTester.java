package gna;

import java.util.Random;

public class SortingAlgorithmsExtTester {

	private SortingAlgorithms sorter = new SortingAlgorithms();

	/**
	 * 
	 * @param numberOfTests
	 * @return Returns an array of integers which holds the amount of comparisons for
	 * 			each test up to numberOfTests for Insertion sort.
	 */
	public int[][] getInsertionSortData(int numberOfTests, boolean sorted){
		int[][] compares = new int[numberOfTests][numberOfTests];

		for(int i = 0; i < numberOfTests; i++)
		{
			if (sorted == true){
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateSortedArray(i); 
					compares[i][j] = sorter.insertionSort(array);
				}
			}else{
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateRandomArray(i); 
					compares[i][j] = sorter.insertionSort(array);
				}				
			}
		}
		return compares;
	}
	/**
	 * 
	 * @param numberOfTests
	 * @return Returns an array of integers which holds the amount of comparisons for 
	 * 			each test up to numberOfTests for Selection sort.
	 */
	public int[][] getSelectionSortData(int numberOfTests, boolean sorted){
		int[][] compares = new int[numberOfTests][numberOfTests];

		for(int i = 0; i < numberOfTests; i++)
		{
			if (sorted == true){
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateSortedArray(i); 
					compares[i][j] = sorter.selectionSort(array);
				}
			}else{
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateRandomArray(i); 
					compares[i][j] = sorter.selectionSort(array);
				}				
			}
		}
		return compares;
	}

	/**
	 * 
	 * @param numberOfTests
	 * @return Returns an array of integers which holds the amount of comparisons for 
	 * 			each test up to numberOfTests for mergesort.
	 */
	public int[][] getMergeSortData(int numberOfTests, boolean sorted){
		int[][] compares = new int[numberOfTests][numberOfTests];

		for(int i = 0; i < numberOfTests; i++)
		{
			if (sorted == true){
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateSortedArray(i); 
					compares[i][j] = sorter.mergeSort(array);
				}
			}else{
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateRandomArray(i); 
					compares[i][j] = sorter.mergeSort(array);
				}				
			}
		}
		return compares;
	}
	/**
	 * 
	 * @param numberOfTests
	 * @return Returns an array of integers which holds the amount of comparisons for 
	 * 			each test up to numberOfTests for quicksort.
	 */
	public int[][] getQuickSortData(int numberOfTests, boolean sorted){
		int[][] compares = new int[numberOfTests][numberOfTests];

		for(int i = 0; i < numberOfTests; i++)
		{
			if (sorted == true){
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateSortedArray(i); 
					compares[i][j] = sorter.quickSort(array);
				}
			}else{
				for(int j = 0; j < numberOfTests;j++ ){
					Comparable[] array = generateRandomArray(i); 
					compares[i][j] = sorter.quickSort(array);
				}				
			}
		}
		return compares;
	}

	/**
	 * 
	 * @param size
	 * @return Returns an array of the given size of random integers between 0 and size - 1.
	 */
	public Comparable[] generateRandomArray(int size){
		Comparable[] a = new Comparable[size];
		Random rnd = new Random();
		for(int i = 0; i < size; i++){
			int rndInt = rnd.nextInt(size);
			a[i] = rndInt;
		}

		return a;
	}

	/**
	 * 
	 * @param size
	 * @return Returns an array of the given size of sorted integers.
	 */
	public Comparable[] generateSortedArray(int size){
		Comparable[] a = new Comparable[size];
		for(int i = 0; i < size; i++){
			a[i] = i;
		}
		return a;
	}
}
