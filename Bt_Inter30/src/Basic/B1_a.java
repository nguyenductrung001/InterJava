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
public class B1_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,i;
        System.out.println("Moi ban nhap vao n: ");
        n = sc.nextInt();
        if(n%2==0){
            i=2;
        }else{
            i=1;
        }
        long sum = 0;
        for(;i<=n;i+=2){
        sum +=i;
        }
        System.out.println(sum);
}
}
