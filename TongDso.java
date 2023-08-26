package LTHDT;

public class TongDso {

	public static void main(String[] args) {
		double tong = 0, n, max = Double.MIN_VALUE;
		for(String e : args) {
			try{n = Double.parseDouble(e);}
			catch(NumberFormatException x) {
				n = 0;
			}
			if(max < n) max =n;
			tong = tong + n;
		}
		System.out.print("Tong = " + tong + ", max = " + max);
	}

}
