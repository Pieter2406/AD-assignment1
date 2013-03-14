package gna;

/**
 * This class provides a number of sorting algorithms.
 *
 * @author Pieter Verlinden
 */

public class SortingAlgorithms {

	private int compares = 0;

	/**
	 * Sorts the given array using selection sort.
	 * 
	 * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
	 */
	public <T extends Comparable<T>> int selectionSort(T[] array) {
		/**
		 * Source: Algorithms by Robert Sedgewick & Kevin Wayne p249 
		 */
		compares = 0;
		int N = array.length;

		for(int i = 0; i < N; i++){
			int min = i;
			for(int j = i+1; j < N; j++){
				if (less(array[j],array[min])){
					min = j;
				}
			}
			exch(array,i,min);
		}

		return compares;

	}

	/**
	 * Sorts the given array using insertion sort.
	 * 
	 * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
	 */
	public <T extends Comparable<T>> int insertionSort(T[] array) {
		/**
		 * Source: Algorithms by Rober Sedgewick & Kevin Wayne p251
		 */
		compares = 0;
		int N = array.length;
		for (int i = 1; i < N; i++){
			for(int j = i; j > 0 && less(array[j],array[j-1]);j--){
				exch(array, j, j-1);
			}
		}
		return compares;
		//throw new RuntimeException("not implemented");
	}

	/**
	 * Sorts the given array using (2-way) merge sort.
	 *
	 * HINT: Java does not supporting creating generic arrays (because the compiler uses type erasure for generic types).
	 * For example, the statement "T[] aux = new T[100];" is rejected by the compiler. 
	 * Use the statement "T[] aux = (T[]) new Comparable[100];" instead. 
	 * Add an "@SuppressWarnings("unchecked")" annotation to prevent the compiler from reporting a warning. 
	 * Consult the following url for more information on generics in Java: 
	 * http://download.oracle.com/javase/tutorial/java/generics/index.html
	 *
	 * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
	 */
	private Comparable[] aux;

	public <T extends Comparable<T>> int mergeSort(T[] array) {
		compares = 0;
		aux = new Comparable[array.length];
		mSort(array,0,array.length - 1);
		return compares;
		//throw new RuntimeException("not implemented");
	}
	/**
	 * Mergesorts the given array with the given parameters
	 * 
	 */
	private void mSort(Comparable[] tempArray,int lower, int upper){
		if (upper <= lower) return;
		int middle = lower + (upper-lower)/2;
		mSort(tempArray, lower, middle);
		mSort(tempArray, middle + 1, upper);
		merge(tempArray, lower, middle, upper);
	}
	private void merge(Comparable[] tempArray, int lower, int middle, int upper){
		int i = lower, j = middle +1;
		for (int k = lower; k <= upper; k++){
			aux[k] = tempArray[k];
		}
		for(int k = lower; k <= upper ; k++){
			if		(i > middle)							{tempArray[k] = aux[j++];}
			else if	(j > upper)								{tempArray[k] = aux[i++];}
			else if	(less(tempArray[j],aux[i]))				{tempArray[k] = aux[j++];}
			else 												{tempArray[k] = aux[i++];}
		}

	}

	/**
	 * Sorts the given array using quick sort. Do NOT perform a random shuffle.
	 * 
	 * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
	 */
	public <T extends Comparable<T>> int quickSort(T[] array) {
		compares = 0;
		qSort(array,0,array.length -1);
		return compares;
		//throw new RuntimeException("not implemented");
	}

	private void qSort(Comparable[] tempArray, int lower, int upper){
		if(upper <= lower) return;
		int j = partition(tempArray, lower, upper);
		qSort(tempArray, lower, j-1);
		qSort(tempArray, j+1, upper);
	}
	private int partition(Comparable[] tempArray, int lower, int upper){
		int i = lower, j = upper+1;
		Comparable v = tempArray[lower];
		while(true)
		{
			while (less(tempArray[++i],v)) if(i == upper) break;
			while (less(v,tempArray[--j])) if (j == lower) break;
			if (i >= j) break;
			exch(tempArray,i,j);
		}
		exch(tempArray, lower, j);
		return j;
	}

	/**
	 * Sorts the given array using k-way merge sort. The implementation can assume that k is at least 2. 
	 * k is the number of the number of subarrays (at each level) that must be separately sorted via a recursive call and merged via a k-way merge. 
	 * For example, if k equals 3, then the array must be subdivided into three subarrays that are each sorted by 3-way merge sort. After the 3 sub-
	 * arrays, these sub-arrays are combined via a 3-way merge.
	 *
	 * Note that if k is larger than the length of the array (or larger than the length of a sub-array in a recursive call), 
	 * then the implementation is allowed sort that sub-array using quick sort.
	 *
	 * @return An non-null array of length 2. The first element of this array is the number of comparisons (i.e. calls to compareTo) performed by
	 *         the algorithm, while the second element is the number of data moves.
	 */
	public <T extends Comparable<T>> int[] kWayMergeSort(T[] array, int k) {
		int[] a = {-1,-1};
		return a;
	}

	private boolean less(Comparable v, Comparable w){
		compares++;
		return v.compareTo(w) < 0;
	}
	private void exch(Comparable[] tempArray, int i, int j){
		Comparable t = tempArray[i]; tempArray[i] = tempArray[j]; tempArray[j] = t;
	}
}