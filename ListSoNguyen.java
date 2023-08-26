package LTHDT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ListSoNguyen {
	public void NhapSo(ArrayList<Integer>So_nguyen) {
		Scanner sc = new Scanner(System.in);
		String n;
		int a;
		System.out.printf("Hay nhap vao danh sach cac so nguyen.\n");
		System.out.printf("Nhap vao chu bat ki de ket thuc danh sach.\n");
		do {
			n = sc.nextLine();
			try {a = Integer.parseInt(n);
			So_nguyen.add(a);
			}
			catch(Exception X) {
				n ="ERROR";
			}

		}while(!n.contentEquals("ERROR"));
	}

	public void Xuat(ArrayList<Integer>So_nguyen) {
		for( int i : So_nguyen) {
			System.out.printf("%d ", i);
		}
		System.out.printf("\n");
	}

	public void TimX(ArrayList<Integer>So_nguyen) {
		Scanner sc = new Scanner(System.in);
		int dem = 0;
		System.out.println("Nhap vao so X can tim.");
		int x = sc.nextInt();
		for( int i : So_nguyen) {
			if(i == x) {
				dem++;
			}
		}
		if(dem == 0) {
			System.out.printf("So %d khong co trong danh sach.\n", x);
		}else {
			System.out.printf("So %d xuat hien %d lan.\n", x, dem);
		}
		
	}

	public void Sort(List<Integer>So_nguyen) {
		Collections.sort(So_nguyen);
	}

	public static void main(String[] args) {
		ListSoNguyen BATDAU = new ListSoNguyen();
		ArrayList<Integer>So_nguyen = new ArrayList<Integer>();
		BATDAU.NhapSo(So_nguyen);
		BATDAU.TimX(So_nguyen);
		BATDAU.Sort(So_nguyen);
		BATDAU.Xuat(So_nguyen);
	}
}
