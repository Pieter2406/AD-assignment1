package gna;

import java.text.DecimalFormat;

import edu.princeton.cs.introcs.*;


public class DoublingRatio {
	private static SortingAlgorithms sorter = new SortingAlgorithms();
	private Stopwatch clock = new Stopwatch();
	private static SortingAlgorithmsExtTester rndArray = new SortingAlgorithmsExtTester();
	private static final int MAX = 512000;
	private static String ALGORITHM = "Insertion";
	
	public static double getSortAlgoTime(String algorithm, int size){
		Comparable[] randomArray = rndArray.generateRandomArray(size);
		
		
		if(algorithm.toLowerCase().equals("selection")){
			Stopwatch timer = new Stopwatch();
			int compares = sorter.selectionSort(randomArray);
			return timer.elapsedTime();
		}
		else if(algorithm.toLowerCase().equals("insertion")){
			Stopwatch timer = new Stopwatch();
			int compares = sorter.insertionSort(randomArray);
			return timer.elapsedTime();
		}
		else if(algorithm.toLowerCase().equals("merge")){
			Stopwatch timer = new Stopwatch();
			int compares = sorter.mergeSort(randomArray);
			return timer.elapsedTime();
		}
		else if(algorithm.toLowerCase().equals("quick")){
			Stopwatch timer = new Stopwatch();
			int compares = sorter.quickSort(randomArray);
			return timer.elapsedTime();
		}
		return -1;
	}
	public static void main(String[] args){
		double previous = 0;
		System.out.println(ALGORITHM + "sort Doubling ratio data");
		System.out.println("Size\tTime\tRatio\n");
		DecimalFormat df = new DecimalFormat("#.#");
		for (int N = 250; N <= MAX; N *= 2){
			double time = getSortAlgoTime(ALGORITHM,N);
			double ratio = time / previous;
			previous = time;
			System.out.println(N + "\t" + df.format(time) + "\t" + df.format(ratio));
			
		}
	}
	
}
