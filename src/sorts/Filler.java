package sorts;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Filler {
	List<Integer> A;
    public Filler() {
        A = new ArrayList<Integer>();
    }
    
    public int[] oneToTen () {
        A.clear();
        for (int i = 1; i <= 10; i++) 
            A.add(i);
        Collections.shuffle(A);
        int[] retVal = new int[10];
        for (int i = 0; i < 10; i++) {
            retVal[i] = A.get(i);
        }
        return retVal;
    }
    
    public int[] oneToHundred () {
        A.clear();
        for (int i = 1; i <= 100; i++) 
            A.add(i);
        Collections.shuffle(A);
        int[] retVal = new int[100];
        for (int i = 0; i < 100; i++) {
            retVal[i] = A.get(i);
        }
        return retVal;
    }
    
    public int[] oneToThousand () {
        A.clear();
        for (int i = 1; i <= 1000; i++) 
            A.add(i);
        Collections.shuffle(A);
        int[] retVal = new int[1000];
        for (int i = 0; i < 1000; i++) {
            retVal[i] = A.get(i);
        }
        return retVal;
    }
    
    public int[] oneToTenThousand () {
        A.clear();
        for (int i = 1; i <= 10000; i++) 
            A.add(i);
        Collections.shuffle(A);
        int[] retVal = new int[10000];
        for (int i = 0; i < 10000; i++) {
            retVal[i] = A.get(i);
        }
        return retVal;
    }
    
    public int[] oneToHundredThousand () {
        A.clear();
        for (int i = 1; i <= 100000; i++) 
            A.add(i);
        Collections.shuffle(A);
        int[] retVal = new int[100000];
        for (int i = 0; i < 100000; i++) {
            retVal[i] = A.get(i);
        }
        return retVal;
    }
    
    public int[] oneToMillion () {
        A.clear();
        for (int i = 1; i <= 1000000; i++) 
            A.add(i);
        Collections.shuffle(A);
        int[] retVal = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            retVal[i] = A.get(i);
        }
        return retVal;
    }
    
    public int[] shuffle(int[] array) {
    	A.clear();
    	for (int i = 0; i < array.length; i++) 
    		A.add(i);
    	Collections.shuffle(A);
    	int[] retVal = new int[array.length];
    	for (int i = 0; i < array.length; i++)
    		retVal[i] = A.get(i);
    	return retVal;
    }
}
