package buoi1;

import java.util.Scanner;

public class HinhTron {
	public static void main(String[] args) {
		double r, dt, cv;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh duong: "); r = sc.nextDouble();
		
		// tinh chu vi
		cv = 2*Math.PI*r;
	
		System.out.println("chu vi= "+cv);
		
		// tinh dien tich
		dt = Math.PI*Math.pow(r, 2);
		System.out.println("Dien tich :"+dt);
		}
	
}
