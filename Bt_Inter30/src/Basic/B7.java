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
public class B7 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố: ");
        n = Integer.parseInt(sc.nextLine());
        if (n < 100000 || n > 999999) {
            while (true) {
                System.out.println("Nhập số nguyên tố có 6 số! Nhập lại: ");
                n = Integer.parseInt(sc.nextLine());
            }
        } else {
            if (n % 2 != 0) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " ko là số nguyên tố");
            }
        }
    }

}

