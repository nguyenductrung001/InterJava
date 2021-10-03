/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr ;
        int n , x;
         System.out.println("Moi ban nhap n");
         n = sc.nextInt();
         System.out.println("nhap so phan cua mang arr: co "+n+"Phan tu: ");
         arr = nhap(n, sc);
         System.out.println("Nhap x : ");
         x = sc.nextInt();
         int index = -1;
         for (int i = 0; i < n; i++) {
            if(arr[i] > x){
                index = i;
                break;
            }
        }
         if(index == -1){
         // chen vao cuoi 
         arr[n] = x;
         }else{
             // dich phai toan bo cac phan tu vi tri index
             for (int i = n; i>index; i--) {
                arr[i] = arr[i-1];
             }
             arr[index] = x;
         }
         System.out.println(Arrays.toString(arr));
    }
    public static int [] nhap(int n , Scanner sc){
        int[] x = new int [n+1];
        for (int i = 0; i <n; i++) {
            x[i]= sc.nextInt();
        }
        return x;
    }
}
