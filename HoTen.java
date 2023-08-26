package LTHDT;

import java.util.Scanner;

public class HoTen {

	public void XuatTen(String Ten) {

		for(int i = Ten.lastIndexOf(" ")+1; i < Ten.length(); i++) {
			System.out.printf("%c", Ten.charAt(i));
		}
	}

	public String NhapTen() {
		Scanner sc = new Scanner(System.in);
		String HoTen = sc.nextLine();
		return HoTen;
	}

	public static void main(String[] args) {
	    HoTen Name = new HoTen();
		Name.XuatTen(Name.NhapTen());
	}
}