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
public class B9 {

    static void printSoThuanNghich7() {
        for (int i = 100; i <= 999; i++) {
            String n = String.valueOf(i);
//            System.out.println(n);
            String reverseN = new StringBuilder(n).reverse().toString();
//            System.out.println(reverseN);
            for (int j = 0; j <= 9; j++) {
                System.out.println(n + j + reverseN);
            }
        }
    }

    static void printSoThuanNghich(int n) {
        int m = n / 2;
        int start = (int) Math.pow(10, m - 1);
        int end = (int) Math.pow(10, m) - 1;
        for (int i = start; i <= end; i++) {
            if (kiemTra068(i)) {
                String reverseI = new StringBuilder(i + "").reverse().toString();
                // n le
                if (n % 2 == 1) {
                    for (int j = 0; j <= 9; j++) {
                        if (kiemTra068(j)) {
                            String soThuanNghich = i + "" + j + "" + reverseI;
                            if(kiemTraChiaHet10(soThuanNghich)) {
                                System.out.println(soThuanNghich);
                            }
                        }
                    }
                } // n chan
                else {
                    String soThuanNghich = i + "" + reverseI;
                    if(kiemTraChiaHet10(soThuanNghich)) {
                        System.out.println(soThuanNghich);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 7; i <= 9; i++) {
            printSoThuanNghich(i);
        }
//        test("100");
    }

    private static boolean kiemTra068(int n) {
        String str = n + "";

        if (str.contains("1")
                || str.contains("2")
                || str.contains("3")
                || str.contains("4")
                || str.contains("5")
                || str.contains("7")
                || str.contains("9")) {
            return false;
        }
        return true;
    }

    private static boolean kiemTraChiaHet10(String str) {
        int num = Integer.parseInt(str);
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum % 10 == 0;
    }
}
