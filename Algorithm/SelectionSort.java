package Algorithm;

import java.util.Scanner;

public class SelectionSort {
    public static void Sort(int a[])
    {
        int n=a.length,i,j,p,temp;
        for (i = 0; i < n - 1; i++)
        {
            p = i;
            for (j=i+1; j < n; j++)
            {
                if (a[p]<a[j])
                    p=j;
            }
            temp=a[p];
            a[p]=a[i];
            a[i]=temp;
        }
    }
    public static void printArray(int a[]) {
        for(int i=0; i < a.length; i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    public static void main(String[] args) {
        int n, res,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        n = s.nextInt();
        int a[] = new int[n];
        for( i=1; i < n+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            a[i] = s.nextInt();
        }
        Sort(a);
        System.out.print("Selection sort:");
        printArray(a);
    }
}
