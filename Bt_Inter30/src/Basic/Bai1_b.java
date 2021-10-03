/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1_b {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n: ");
        n = sc.nextInt();
        double sum = 0;
        for(int i =1 ; i<=n;i++){
        sum+=(double)1/i;
        }
        System.out.println("Tong cua n la : " + sum);
        
    }
}
