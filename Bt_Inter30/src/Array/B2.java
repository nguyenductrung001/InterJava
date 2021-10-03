/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class B2 {
     public void bubbleSort(int arr[]) {
        int temp;
        int i, j;

        boolean swapped = false;

        // lap qua tat ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;

            // vong lap thu hai
            for (j = 0; j < arr.length - 1 - i; j++) {
                System.out.print("So sanh cac phan tu: [" + arr[j] + ", " + arr[j + 1] + "]");

                // kiem xa xem so ke tiep co nho hon so hien tai hay khong
                // trao doi cac so.
                // (Muc dich: lam noi bot (bubble) so lon nhat)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                    System.out.println(" => trao doi [" + arr[j] + ", " + arr[j + 1] + "]");
                } else {
                    System.out.println(" => khong can trao doi.");
                }
            }

            // neu khong can trao doi nua, tuc la
            // mang da duoc sap xep va thoat khoi vong lap.
            if (!swapped) {
                break;
            }

            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khoi tao mang arr
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i + 1);
            arr[i] = sc.nextInt();
        }
        B2 test = new B2();
        System.out.println("Mang du lieu dau vao: ");
        test.display(arr);
        System.out.println("-----------------------------");
        test.bubbleSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        test.display(arr);
    }
}
