package Lectures1.CW;

public class Main {
    public static void main(String[] args) {
        int[] a = {4, 5, 6};
        int[] b = {1, 2, 3};
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }

//        //Original array
//        int arr1[] = {12, 22, 34, 22, 54};
//        int arr2[] = {29, 54, 98, 87, 2};
//        // Printing both arras
//        printArray(arr1);
//        printArray(arr2);
//        int resultantArr[] = new int[arr1.length];
//        // Using for loop to add the elements from arr1 and arr2
//        for(int i=0;i<arr1.length;i++)
//            resultantArr[i] = arr1[i] + arr2[i];
//        // Printing the resultant array
        printArray(c);

    }
    // Function to print the array
    public static void printArray(int arr[])
    {
        System.out.println("The array elements are");
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
