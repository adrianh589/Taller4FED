#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdlib>
using namespace std;

void Bubblesort(int A[]){
    bool swapped;
    for(int i=0; i<sizeof(A)-1;i++)
    {
        swapped=false;
        for(int j=0; i<sizeof(A)-1;i++)
            //compare to adjacent elements
        if (A[j]>A[j+1])
        {
           //swap them
           int swap=A[j];
           A[j]=A[j+1];
           A[j+1]=swap;
           swapped=true;
        }
        //if no number was swapped, the array is sorted now
        if(not swapped)
            {
                break;
            }
    }

}

/* Function to print an array */
void printArray(int arr[], int n)
{
    for (int i=0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}




int main(int argc, char **argv)
{
   //Aray with numbers
   int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr)/sizeof(arr[0]);
    Bubblesort(arr);
    printf("Sorted array : \n");
    printArray(arr,n);



    return 0;
}
