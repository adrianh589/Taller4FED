import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class MergeSort {

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);//Creation of buffers
		
		System.out.println("Introduzca los numeros ordenados separados por coma");
		String[] numeros=br.readLine().split(",");//This function read a numbers sepparated with commas
		int[] array = new int[numeros.length];//In this array, save the numbers to transform string in int

		for(int i = 0; i < numeros.length; i++) {//Process to save numbers in String in the array in int
			array[i] = Integer.parseInt( numeros[i] );
		}
		
		array=MergeSort(array);//Call a recursion MergeSort
         
		for(int i=0;i<array.length;i++) 
		{
			System.out.print(array+" " );
		}
		
			

	}
	
	
	static int[] MergeSort (int[]unsorted_array) 
	{   
		int left_array[] = new int [unsorted_array.length/2];
		int right_array[] = new int [unsorted_array.length-(unsorted_array.length/2)];
		int left_subarray[]=new int [unsorted_array.length/2];
		int right_subarray[]=new int [unsorted_array.length-(left_subarray.length)];
		int SortedL[];
		int SortedR[];
		
		if(unsorted_array.length==1) 
		{
			return unsorted_array;
		}
		
		else 
		{
		/*Split in two parts*/
			//Left sub-array
			for(int i =0;i<unsorted_array.length/2;i++) 
			{
			  left_array=left_subarray;
			}
			//Right subarray
			for(int j =(unsorted_array.length/2)+1;j<unsorted_array.length;j++) 
			{
			  right_array=unsorted_array;
			}
			  SortedL=MergeSort(left_subarray);
			  SortedR=MergeSort(right_subarray);
		}
		/*following the strategy Divide & Conquer*/
		return Merge(SortedL,SortedR);
	}
	
	    public static int[] Merge(int[] A, int[] B) 
	    {
		 int l=A.length+B.length;
		 /*Create C array*/
		 int[] C= new int [l];
		 
		 int indexA=0;
		 int indexB=0;
		 int indexC=0;
		 
		 while (indexA >1 && indexB >1) {
			 if (A[indexA]<B[indexB]) {
				 /*Add element from sortedL array*/
				 C[indexC]=A[indexA];
				 indexA= indexA+1;
				 indexC = indexC + 1;
			 }
			 else 
			 {
				 /* add element from B array*/
				 C[indexC]=B[indexB];
				 indexB=indexB+1;
				 indexC=indexC + 1;
				 
			 }
		 }
		 
		 /*one of A or B has still some elements*/
		 while(indexA<A.length) 
		 {
			C[indexC]=A[indexA];
			indexA=indexA+1;
			indexC=indexC+1;
		 }
		 
		 while (indexB<B.length) 
		 {
			 C[indexC]=B[indexB];
			 indexB=indexB+1;
			 indexC=indexC+1;
		 }
		return C;
	    }

}
