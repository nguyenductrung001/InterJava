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
public class B6 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(); 
        int i =2;
        if(n==1){
            System.out.println(n+ " = " + n);
        }else{
            System.out.print(n+ " = " );
         while(n != 1){
             if(n%i ==0){
                 System.out.print(i+" x " );
                 n/=i;
             }else{
                 ++i;
             }
         }
            System.out.println("\b\b\b");
        }
    }
}
