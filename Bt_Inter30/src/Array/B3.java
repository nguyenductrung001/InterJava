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
public class B3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count;
        int[] arr, res;
        System.out.println("Moi ban nhap so phan tu cua mang: ");
        n = sc.nextInt();
        arr = new int[n];
        res = new int[n];
        System.out.println("MOi ban nhap so phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            res[i] = -1;
        }
        // dem so lan xuat hien cua cac phan tu trong mang.
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (res[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    res[j] = 0;
                }

            }
            if (res[i] != 0) {
                res[i] = count;
            }

        }
        // tim so lan xuat hien nhieu nhat 
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        System.out.print("So  lan xuat hien nhat la: " + max + "So do la : ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max) {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("\b\b");
    }

}
