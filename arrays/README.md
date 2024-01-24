In Java,Arrays are used to store the elements of same data type.
** Heap objects does not have contiguous memory allocation.
Arrays,internally, may not be contiguous in java.
So in java, for Arrays , memory allocation depends on JVM.

** Syntax:

int[] arr_name =  new int[size];
  ↑      ↑          ↑       ↪ size of array
data- reference  creating the object
type   variable     in heap memory
|——————————————| |———————————————————|
(at compile time)    (at runtime)


 ** Array declaration:      int[] arr_name;
 ** Array initialization:   arr_name = {element1, element2, element3,....};
                                            ↑       ↑          ↑        ↑
                                      index 0       1          2  ......n
=============================================================================================================================================
Three ways to print Array:

1. for loop
for(int i = 0; i< arr.length ;i++)
{
System.out.print(arr[i]+" ")
}

=============================================================================================================================================

2. enhanced for loop
 syntax:    for(int num : array_name)       // for every element in array, print the element
            {
            System.out.print(num+" ")
            }

***    Here "int" is datatype of the element of the array and "num" represents element of the array

=============================================================================================================================================

3. System.out.println(Arrays.toString(arr));   // It will print array in a formatted manner like [element1,element2, element3,....]

=============================================================================================================================================


********************************
**  Multi-dimensional Array:  **
********************************

2-D Array

int[][] array_name = new int[rows][cols]

NOTE: necessary to give row no. but not necessary to write cols no.
 (or we can hard-code like below)
int[][] arr = {
                {1, 2, 3}
                {4, 5, 6}
                {7, 8, 9}
               }
          we can imagine this as array of arrays.
for example: arr[0]= [1, 2, 3]
and          arr[0][2] = 3

=============================================================================================================================================

Inputting a 2D array of varying column:

for (int row = 0; row < arr.length; row++)
        {
            // for each col in every row
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }


Difference between----- arr.length -----  arr[0].length ------  arr[1].length
arr.length==> gives the length of the array(i.e. total number of rows in array)
arr[0].length===> gives the total number of columns in the first row.
arr[1].length====> gives the total number of columns in the second row.

Example:    arr[][] = {
                        {1, 2, 3},      // 0th index
                        {4, 5},         // 1st index
                        {6, 7 ,8, 9}    // 2nd index -> arr2D[2] = {6, 7, 8, 9}
                        }

arr.length = 3          // total number of rows in arr
arr[0].length = 3       // total number of columns in 0th row
arr[1].length = 2       // total number of columns in 1st row
arr[2].length = 4       // total number of columns in 2nd row


0 1 2 3
1 2 3 4   0
5 6 7 8   1
9 1 2 3   2
5 6 1 6   3

