package sorts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Sort {
	public Sort() {}

    public int[] bubbleSort(int[] arr) {
    	long startTime = System.nanoTime();
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return arr;
    }

    public int[] insertionSort(int[] A) {
    	long startTime = System.nanoTime();
        for (int i = 1; i < A.length; i++) {
        	int tmp = A[i];
        	int j;
        	for (j = i - 1; j >= 0 && tmp < A[j]; j--)
        		A[j + 1] = A[j];
        	A[j + 1] = tmp;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return A;
    }

    public int[] selectionSort(int[] A) {
    	long startTime = System.nanoTime();
        int smallest = 0;
        for (int i = 0; i < A.length; i++) {
            smallest = i;
            for (int j = i; j < A.length; j++) 
                if (A[j] < A[smallest]) 
                    smallest = j;
            
            int tmp = A[i];
            A[i] = A[smallest];
            A[smallest] = tmp;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return A;
    }
    
    public int[] mergeSort(int[] array) {
    	
        int[] retVal = null;
    	if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            
            mergeSort(left);
            mergeSort(right);
            
            retVal = merge(array, left, right);
        }
    	
    	return retVal;
    }
    
    private int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) 
            left[i] = array[i];
        
        return left;
    }
    
    private int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) 
            right[i] = array[i + size1];
        
        return right;
    }
    
    private int[] merge(int[] result, int[] left, int[] right) {
        int i1 = 0; 
        int i2 = 0; 
        
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1] <= right[i2])) {
                result[i] = left[i1]; 
                i1++;
            } else {
                result[i] = right[i2];  
                i2++;
            }
        }
        return result;
    }
    
    private int partition(int arr[], int left, int right)
    {
          int i = left, j = right;
          int tmp;
          int pivot = arr[(left + right) / 2];
         
          while (i <= j) {
                while (arr[i] < pivot)
                      i++;
                while (arr[j] > pivot)
                      j--;
                if (i <= j) {
                      tmp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = tmp;
                      i++;
                      j--;
                }
          };
         
          return i;
    }
     
    
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    
    private void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
        }
    }
    
    private void maxheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }
    
    private void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t; 
        }
    
    public int[] heapSort(int []a0){
    	long startTime = System.nanoTime();
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return a0;
    }
   
    public int[] quickSort(int arr[], int left, int right) {
          int index = partition(arr, left, right);
          if (left < index - 1)
                quickSort(arr, left, index - 1);
          if (index < right)
                quickSort(arr, index, right);
          
         
          return arr;
    }
    
    public int[] radixSort(int[] A) {
    	long startTime = System.nanoTime();
    	int i, m = A[0], exp = 1, n = A.length;
        int[] b = new int[A.length];
        for (i = 1; i < n; i++)
            if (A[i] > m)
                m = A[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[A.length];
 
            for (i = 0; i < n; i++)
                bucket[(A[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(A[i] / exp) % 10]] = A[i];
            for (i = 0; i < n; i++)
                A[i] = b[i];
            exp *= 10;        
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return A;
    }
}
