package LTHDT;

import java.util.Scanner;

public class Sum2So {

	 public int nhap() {
	    	Scanner sc = new Scanner(System.in);
	    	String s;
	    	int n;
	    	do {
	    		System.out.printf("Hay nhap vao 1 so nguyen:\n");
	    		s = sc.nextLine();
	    		try { n = Integer.parseInt(s);}
	    		catch(NumberFormatException e) {
	    			n = Integer.MIN_VALUE;
	    			System.out.println("Ban da nhap sai .\n");
	    		}
	    	}while(n == Integer.MIN_VALUE);
	    	return n;
	    }
	    
		public static void main(String[] args) {
			Sum2So X = new Sum2So();
	        int a = X.nhap();
	        int b = X.nhap();
	        System.out.printf("Tong 2 so vua nhap la a+b=%d\n", a+b);
		    
		}

}
