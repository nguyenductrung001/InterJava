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
public class B10 {

    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (kiemTra2357(i)) {
                if (kiemTraSoNguyenTo(i)) {
                    int j = nghichDaoSo(i);
                    if (kiemTraSoNguyenTo(j)) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

    private static boolean kiemTra2357(int n) {
        String str = n + "";

        return str.contains("2")
                && str.contains("3")
                && str.contains("5")
                && str.contains("7");
    }

    private static boolean kiemTraSoNguyenTo(int i) {
        if (i < 2) {
            return false;
        }

        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }

    private static int nghichDaoSo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
