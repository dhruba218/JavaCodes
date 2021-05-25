package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int ch;

        do{
            System.out.println(" Press 1: Bubble Sort \n Press 2: Insertion Sort \n Press 3: Binary Search \n Press 4: Exit \n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    int temp = 0;
                    for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                            if(arr[j-1] > arr[j]){
                                temp = arr[j-1];
                                arr[j-1] = arr[j];
                                arr[j] = temp;
                            }

                        }
                    }
                    System.out.println("Array After Bubble Sort");
                    for(int i=0; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 2:
                    for (int j = 1; j < n; j++) {
                        int key = arr[j];
                        int i = j-1;
                        while ( (i > -1) && ( arr [i] > key ) ) {
                            arr [i+1] = arr [i];
                            i--;
                        }
                        arr[i+1] = key;
                    }
                    System.out.println("Array After Insertion Sort");
                    for(int i=0; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 3:
                    System.out.println("Enter the key which you want to search ");
                    int key = sc.nextInt();
                    int last=arr.length-1;
                    int result = Arrays.binarySearch(arr,key);
                    if (result < 0)
                        System.out.println("Element is not found!");
                    else
                        System.out.println("Element is found at index: "+result);
                    break;

                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println();
            System.out.println("Want to continue?  Press: 1");
            ch = sc.nextInt();

        }while(ch == 1);
    }
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);
            }else{
                return binarySearch(arr, mid+1, last, key);
            }
        }
        return -1;
    }


}
