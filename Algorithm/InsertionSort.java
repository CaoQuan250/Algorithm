package Algorithm;

import java.util.Scanner;

public class InsertionSort {
    public static void sortInsertion(int [] sort_arr){
        for(int i=0;i<sort_arr.length;i++){
            int j = i;
            while(j > 0 && sort_arr[j-1]<sort_arr[j]){

                int key = sort_arr[j];
                sort_arr[j] = sort_arr[j-1];
                sort_arr[j-1] = key;
                j = j-1;
            }
        }
    }
    public static void main( String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int x = sc.nextInt();
        int a[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            a[i] = sc.nextInt();
        }
        sortInsertion(a);
        System.out.print("Insertion Sort:");
        for(int i=0;i < a.length ;i++){
            System.out.print(" "+a[i]);
        }
    }
}
