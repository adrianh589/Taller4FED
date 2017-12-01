import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterpolationSearch {

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);//Creation of buffers
		
		System.out.println("Introduzca los numeros ordenados separados por coma");
		String[] numeros=br.readLine().split(",");//This function read a numbers sepparated with commas
		int[] array = new int[numeros.length];//In this array, save the numbers to transform string in int
		
		System.out.println("Introduzca valor a encontrar");
		int x=Integer.parseInt(br.readLine());//Value to find

		for(int i = 0; i < numeros.length; i++) {//Process to save numbers in String in the array in int
			array[i] = Integer.parseInt( numeros[i] );
		}
		
		int index1=InterpolationSearch(array, x);//Call a recursion InterpolationSearch

		
			System.out.print("El numero "+x+" esta en la posicion numero "+(index1+1)+" del arreglo" );//Print in console the position of the number
	    

	}
	
	static int InterpolationSearch(int []A, int x) {
		int lower_bound=0;
		int upper_bound=A.length-1;
		int index=-1;
		/* if upper bound is less than lower bound, there is not a feasible solution */
		while(lower_bound<upper_bound)
		{
			int middlepoint=lower_bound+((upper_bound-lower_bound)/(A[upper_bound] - A[lower_bound])) * (x - A[lower_bound]);
			if (x == A[middlepoint]) {
				/* x has been found */
				index=middlepoint;
				break;
			}else{
				if(x<A[middlepoint]) {
					upper_bound=middlepoint-1;
				}else {
					lower_bound=middlepoint+1;
				}
			}
			
		}
		
		if (lower_bound==upper_bound && A[lower_bound]==x)
		{
			index=lower_bound;
		}
		return index;
		
	}

}
