package gna;

public class DataOutputterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataOutputter unsortedDataOutputter = new DataOutputter(false);
		DataOutputter sortedDataOutputter = new DataOutputter(true);
		SortingAlgorithmsExtTester tester = new SortingAlgorithmsExtTester();
		//unsortedDataOutputter.runInsertionOutputter(100);
		//unsortedDataOutputter.runSelectionOutputter(100);
		//unsortedDataOutputter.runMergeOutputter(100);
		//unsortedDataOutputter.runQuickOutputter(100);
		
		//sortedDataOutputter.runInsertionOutputter(100);
		//sortedDataOutputter.runSelectionOutputter(100);
		//sortedDataOutputter.runMergeOutputter(100);
		//sortedDataOutputter.runQuickOutputter(100);
		//Comparable[] test = tester.generateSortedArray(100);
		//for(Comparable x : test){
			//System.out.println(x);
		//}
	}

}
