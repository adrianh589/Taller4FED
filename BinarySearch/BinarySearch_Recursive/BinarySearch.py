def BinarySearch_Recursive(A,x,lB,uB):
    middlePoint = int((lB + uB) / 2 )#if upper bound is equal than lower bound, there is justone feasible solution
    if(lB == uB):
        if (x == A[middlePoint]):
            #element x has been found
            return middlePoint
        else:
            return -1
    else:
        if (x == A[middlePoint]):
            return middlePoint
        else:
            if( x < A[middlePoint]):
                return BinarySearch_Recursive(A,x,lB,middlePoint)
            else:
                return BinarySearch_Recursive(A,x,middlePoint + 1,uB)

class main():
    array = []
    comma = input("ingrese los numeros separados por coma: ")
    split1 = comma.split(",")

    # fill with numbers the array
    for i in range(0, split1.__len__()):
        array.append(int(split1[i]))

    #number to search
    x = int(input("ingrese el numero a buscar: "))

    #call the function BinarySearch
    number_to_search = BinarySearch_Recursive(array,x,0,int(array.__len__()))
    print(x," esta en la posición ", (number_to_search + 1))