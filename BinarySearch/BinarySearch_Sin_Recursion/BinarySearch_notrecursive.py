def BinarySearch_notrecursive(A,x):
    lower_bound=0
    upper_bound=A.__len__()-1
    index=-1
    #if upper bound is less than lower bound, there is not a feasible solution
    while (lower_bound < upper_bound):
        middlepoint=int((lower_bound + upper_bound)/2)
        if (x==A[middlepoint]):
            #x has been found
            index=middlepoint
            break
        else:
            if (x<A[middlepoint]):
                upper_bound=middlepoint-1
            else:
                lower_bound=middlepoint+1

    if (lower_bound == upper_bound & A[lower_bound] == x):
        index=lower_bound
    return index

class main:
    array = []
    #Read the numbers entered by user
    comma = input("ingrese los numeros ordenados separados por coma: ")
    split1 = comma.split(",")

    # fill with numbers the array
    for i in range(0, split1.__len__()):
        array.append(int(split1[i]))

    #number to search
    number_to_search = int(input("ingrese el numero a buscar: "))

    #call the function BinarySearch
    s=BinarySearch_notrecursive(array,number_to_search)
    print(number_to_search," esta en la posición ", (s + 1))