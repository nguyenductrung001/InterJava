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
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,x;
        int sum = 0;
        System.out.println("Moi ban nhap vao so n: ");
        n =sc.nextInt();
        while (n>0) {
            x = n%10;
            n/=10;
            sum+=x;  
        }
        System.out.println("tong cac so trong n là: " + sum);
    }
}
