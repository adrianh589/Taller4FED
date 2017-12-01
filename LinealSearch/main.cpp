#include <iostream>

using namespace std;

int Linealsearch(int A[],int data)
{
    int index=-1;
    //compare with all the elements of the array
    for(int i=0;sizeof(A);i++)
    {
        if (A[i]==data)
        {
            index=i;
            break;

        }
    }
    return index;

}

int main()
{
    //Read  a numbers in the console
    cout<<"Defina el tamaño del arreglo"<<endl;
    int n;
    cin>>n;
    int array[n];
    int numero;
    cout<<"Introduzca los "<<n<<" numeros"<<endl;

    //Fill the matrix with numbers entered by user
    for(int i =0; i<n;i++)
        {
            cin>>numero;
            array[i]=numero;
        }
     cout<<"Ingrese el numero a buscar"<<endl;
    int number_to_search;
    cin>>number_to_search;

    //Call the function Linealsearch
    int result=Linealsearch(array,number_to_search);

    cout<<"Ingrese el numero a buscar"<<endl;

    cout<<"El numero escogido esta en la posicion:"<<endl;
    //Print the searched number
    cout<<result+1;

    return 0;
}

