package harmonikseri;

import java.util.Scanner;

public class harmonikseri {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Hesaplamak istediğiniz sayıyı giriniz :");
		
		double a = input.nextDouble();
		
		double sonuc = 0;
		
		for(double i = 1; i <= a; i++) {
			
			sonuc += 1/i;
			
			
		}
		
		System.out.print("Sonuç :" + sonuc);
		
		
		
		
		
	}

}
