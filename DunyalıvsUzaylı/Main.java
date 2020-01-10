package UzayliVsDunyali;
import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int x=0;
		int round=1;
		int sonuc=0;
		while(x!=-1) {
			Uzayli[] uzayli = new Uzayli[10];
			Dunyali[] dunyali = new Dunyali[10];
			int toplamuzayli=0,toplamdunyali=0;
			for(int i=0;i<10;i++) {
				Dunyali dunyali1 = new Dunyali();
				Uzayli uzayli1 = new Uzayli();
				int s=random.nextInt(2);
				if(s==0) {
					dunyali1 = new Asker(random.nextInt(10),random.nextInt(10));
				}
				else if(s==1) {
					dunyali1 = new Ciftci(random.nextInt(10),random.nextInt(10));
				}
				s=random.nextInt(2);
				if(s==0) {
					uzayli1 = new Cyborg(random.nextInt(10),random.nextInt(10));
				}
				else if(s==1) {
					uzayli1 = new Madenci(random.nextInt(10),random.nextInt(10));
				}
				dunyali[i]=dunyali1;
				uzayli[i]=uzayli1;
				toplamuzayli+=uzayli1.GucHesapla();
				toplamdunyali+=dunyali1.GucHesapla();
			}
			sonuc+=(toplamdunyali - toplamuzayli);
			System.out.println("ROUND "+round++ + " SONUCLARI");
			System.out.println("Uzaylilarin Toplam Gucu  :" + toplamuzayli);
			System.out.println("Dunyalilarin Toplam Gucu  :" + toplamdunyali);
			System.out.println("SONUC   :" + (toplamdunyali - toplamuzayli));
			
			System.out.println("GENEL SONUC   :" + sonuc);
			
			System.out.println("Oyunu bitirmek icin -1 gir...");
			System.out.println("Devam etmek için herhangi bir sayi gir...");
			x=scan.nextInt();
		}
	}
}
