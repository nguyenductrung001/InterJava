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
public class B2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int n,i;
        n = sc.nextInt();
        int count = 0;
        for( i = 1 ; i<=n; i++){
            if(n%i==0){
                count++;
                System.out.print(i+" ");
            }
            
        }
        System.out.println("\nn co " + count + " uoc so");
    }
    
}
