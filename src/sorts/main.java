package sorts;

public class main {
	public static void main (String[] args) {
		Filler filler = new Filler();
		Sort sort = new Sort();
		
		int[] A = filler.oneToMillion();
//		printArray(A, "Original");
//		System.out.println();
		
		System.out.println("-------------------------------------");
		
		//Bubble, Insertion, Selection, Radix
		for (int i = 0; i < 10; i++) {
			A = filler.shuffle(A);
			sort.heapSort(A);
		}
		
		//Heap
//		int[] heapArray = A;
//		for (int i = 0; i < 10; i++) {
//			A = filler.shuffle(A);
//			long startTime = System.nanoTime();
//			for (int j = heapArray.length; j > 1; j--) 
//				heapArray = sort.heapSort(heapArray, j - 1);
//			long endTime = System.nanoTime();
//			System.out.println(endTime - startTime);
//		}
		
		//merge
//		for (int i = 0; i < 10; i++) {
//			A = filler.shuffle(A);
//			long startTime = System.nanoTime();
//			sort.mergeSort(A);
//			long endTime = System.nanoTime();
//			System.out.println(endTime - startTime);
//		}
		
		//Quick
//		for (int i = 0; i < 10; i++) {
//			A = filler.shuffle(A);
//			long startTime = System.nanoTime();
//			sort.quickSort(A, 0, A.length - 1);
//			long endTime = System.nanoTime();
//			System.out.println(endTime - startTime);
//		}
		
		
		System.out.println("-------------------------------------");
//		printArray(sort.bubbleSort(A), "BubbleSort");
//		printArray(sort.insertionSort(A), "InsertionSort");
//		printArray(sort.selectionSort(A), "SelectionSort");
//		printArray(sort.mergeSort(A), "MergeSort");
//		printArray(sort.radixSort(A), "RadixSort");
//		printArray(sort.quickSort(A, 0, A.length - 1), "QuickSort");
	
	}
	
	public static void printArray(int[] A, String sortName) {
		for (int i = 0; i < A.length; i++) 
			System.out.print("[" + A[i] + "]");
		System.out.println(" -> " + sortName);
	}
}
