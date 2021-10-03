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
public class B5 {
    public static void main(String[] args) {
        int n , x,index=-1 , min = Integer.MAX_VALUE;
        int [] arr ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao n ,x: ");
        n = sc.nextInt();
        x  = sc.nextInt();
        arr = new int[n];
        System.out.println("Moi ban nhap cac phan tu cho mang");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if(nguyento(arr[i])&& currentMin<min){
                min = currentMin;
                index = i;
                
            }
        }
        if(index != -1){
            System.out.println("chi so phan tu " +index+", gia tri = " + arr[index]);
        }else{
            System.out.println("Khong ton tai gia tri thoa man");
        }
    }
    public  static  int getMin(int a , int x){
        return Math.abs(a-x);
    }
    public static boolean nguyento(int n){
        if(n<2){
        return  false;
        }
    int a  = (int)Math.sqrt(n);
        for (int i = 2; i <= a ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
}
}
