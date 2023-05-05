package zar.atma.oyunu;

import java.util.Scanner;

public class Oyun {
	public static void main(String[] args) {
		
		System.out.println("Oyun başladı");
		System.out.println("Zar atmak için 1 tuşuna basın");
		System.out.println("Çıkmak için 2 tuşuna basın");
		
		Scanner input = new Scanner(System.in);
		String secim = input.next();
		
		if(secim.equals("2")) {
			System.out.println("Güle Güle");
			return;
		}
		
		double oyuncuRandom = Math.random();
		double bilgisayarRandom = Math.random();
		
		int bilgisayarZari = birIleAltiArasındaSayıVer(bilgisayarRandom);
		int oyuncuZari = birIleAltiArasındaSayıVer(oyuncuRandom);
		
		String kazanan = kazananiVer(bilgisayarZari, oyuncuZari);
		
		System.out.println(kazanan);
	}
	
	private static String kazananiVer(int bilgisayarZari, int oyuncuZari) {
		
		String kazanan = "";
		
		if(bilgisayarZari > oyuncuZari) {
			kazanan = "Bilgisayar("+ bilgisayarZari+")";
		} else if(oyuncuZari > bilgisayarZari) {
			kazanan = "Oyuncu("+oyuncuZari+")";
		} else {
			kazanan = "Beraberlik";
		}
		
		return kazanan;
	}
	
	private static int birIleAltiArasındaSayıVer(double random) {
		
		double sayi = random *10;
	
		
		if(sayi > 0 && sayi <1) {
			return 1;
		}else if(sayi > 1 && sayi < 2) {
			return 2;
		}else if(sayi > 2 && sayi < 3) {
			return 3;
		}else if(sayi > 3 && sayi < 4) {
			return 4;
		}else if(sayi > 4 && sayi < 5) {
			return 5;
		}else if(sayi > 5 && sayi < 6) {
			return 6;
		}else {
			return 6;
		}
		
	}
}
