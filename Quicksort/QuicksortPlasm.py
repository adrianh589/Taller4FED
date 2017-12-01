def QuickSort(A):
    less_subarray=[]
    greater_subarray=[]
    j=[]
    if (A[j]>A[j+1]):
        return A
    #array A is already sorted
    else:#take first set element as a pivot
        pivot=A[0]
        for i in A:
            if A[i]<pivot:
                #build both less and greater than pivot sub-arrays
                less_subarray.add=A[i]
            else:
                greater_subarray.add=A[i]

            #call recursion for each one of the subarrays, and concatenate the results
            return QuickSort(less_subarray) , pivot , QuickSort(greater_subarray)

class main():
    array = []
    comma = input("ingrese los numeros separados por coma: ")
    split1 = comma.split(",")

    # fill with numbers the array
    for i in range(0, split1.__len__()):
        array.append(int(split1[i]))


    #call the function Quicksort
    QuickSort(array);

    #Print ordered array
    print("El arreglo ordenado es:")
    print(array)
