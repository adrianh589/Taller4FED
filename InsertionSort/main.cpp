#include <iostream>

using namespace std;

void insertionSort(int A[])
{
    int x=0;
    int index=0;

    for(int i=0;i<sizeof(A);i++)
        {
          /* select value to be moved */
          x=A[i];
          index=i;
          /* locate hole position for the value to be inserted */
          while(index>0 & A[index-1]>x)
          {
              A[index]=A[index-1];
              index=index-1;

          }
          /* insert the value at hole position */
          A[index]=x;
        }

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

    //Call the function insertionSort
    insertionSort(array);

    cout<<"El arreglo ordenado es"<<endl;
    //Print ordered array
    for (int i=0; i<n;i++)
    {
        cout<<array[i]<<endl;
    }

    return 0;
}
