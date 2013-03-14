package gna;

public class DataOutputter {
	private SortingAlgorithmsExtTester tester = new SortingAlgorithmsExtTester();

	/**
	 * Sorted flag.
	 */
	private boolean sorted = false;
	public DataOutputter(boolean sorted){
		this.sorted = sorted;
	}
	
	public void runInsertionOutputter(int numberOfTests){
		int[][] insertionData = tester.getInsertionSortData(numberOfTests, sorted);
		System.out.println("Insertionsort Data:");
		for(int i = 0; i < numberOfTests; i++){
			for(int j = 0; j < numberOfTests; j++){
				System.out.print(i + "\t");
				System.out.println(insertionData[i][j]);
			}
		}
	}

	public void runSelectionOutputter(int numberOfTests){
		int[][] selectionData = tester.getSelectionSortData(numberOfTests, sorted);
		System.out.println("Selectionsort Data:");
		for(int i = 0; i < numberOfTests; i++){
			for(int j = 0; j < numberOfTests; j++){
				System.out.print(i + "\t");
				System.out.println(selectionData[i][j]);
			}
		}
	}
	
	public void runMergeOutputter(int numberOfTests){
		int[][] mergeData = tester.getMergeSortData(numberOfTests, sorted);
		System.out.println("Mergesort Data:");
		for(int i = 0; i < numberOfTests; i++){
			for(int j = 0; j < numberOfTests; j++){
				System.out.print(i + "\t");
				System.out.println(mergeData[i][j]);
			}
		}
	}
	
	public void runQuickOutputter(int numberOfTests){
		int[][] quickData = tester.getQuickSortData(numberOfTests, sorted);
		System.out.println("Quicksort Data:");
		for(int i = 0; i < numberOfTests; i++){
			for(int j = 0; j < numberOfTests; j++){
				System.out.print(i + "\t");
				System.out.println(quickData[i][j]);
			}
		}
	}
}
