/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Administrator
 */
public class B8 {

    static void printSoThuanNghichA() {
        for (int i = 100; i <= 999; i++) {
            String n = String.valueOf(i);
//            System.out.println(n);
            String reverseN = new StringBuilder(n).reverse().toString();
//            System.out.println(reverseN);
            System.out.println(n+reverseN);
        }
    }
    
    static void printSoThuanNghichB() {
        for (int i = 100; i <= 999; i++) {
            boolean divide5 = true;
            // tim tat ca cac so có 3 chu so, tong chia het cho 5
            if (divide5) {
                printSoThuanNghichA();
            }
            
        }
    }

    public static void main(String[] args) {
        printSoThuanNghichA();
        printSoThuanNghichB();
    }
}
