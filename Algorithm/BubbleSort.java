package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        System.out.print("Nhập số phần tử mảng: ");
        count = scanner.nextInt();
        for (int i = 1; i < count+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j - 1) < list.get(j)) {
                    int tmp = list.get(j - 1);
                    list.set(j -1, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        System.out.print("Bubble sort:");
        for(int a: list) {
            System.out.print(" "+a);
        }
    }
}
