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
public class B1 {

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so pha tu mang: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Moi ban nhap vao mang: ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        boolean doixung = true;
        int soNamGiua = n / 2;
        int x;
        for (int i = 0; i <= soNamGiua; i++) {
            x = n - 1 - i;
            if (arr[i] != arr[x]) {
                doixung = false;
                break;
            }
        }
        if (doixung = true) {
            System.out.println("Mang nay la mang doi xung");
        } else {
            System.out.println("mang nay laf mang khong doi xung.");
        }
    }

}
