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
public class B4 {
    static boolean check(int n) {
		if(n < 2)
			return false;
		
		for(int i = 2 ; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
			
		
		return true;
		
	}
	
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Mời bạn nhập vào a: ");
		a = sc.nextInt();
		
		System.out.print("Mời bạn nhập vào b: ");
		b = sc.nextInt();
		
		for(int i = a ; i <= b ; i ++) {
			if(check(i)) {
				System.out.print(i + " ");
			}
		}
			
		}
}
