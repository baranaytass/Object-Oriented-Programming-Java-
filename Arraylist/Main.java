import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void Doldur(ArrayList<Sinif1> dizi) {
		Random random = new Random();
		for(int i=0;i<10;i++) {
			Sinif1 s = new Sinif1(random.nextInt(10),random.nextInt(10));
			dizi.add(s);
		}
	}
	public static void Sirala(ArrayList<Sinif1> dizi) {
		Sinif1 temp;
		int n = dizi.size();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(dizi.get(j).getX() < dizi.get(j+1).getX()) {
					temp=dizi.get(j);
					dizi.set(j, dizi.get(j+1));
					dizi.set(j+1, temp);
				}
				else if(dizi.get(j).getX() == dizi.get(j+1).getX()) {
					if(dizi.get(j).getY() < dizi.get(j+1).getY()) {
						temp=dizi.get(j);
						dizi.set(j, dizi.get(j+1));
						dizi.set(j+1, temp);
					}
				}
			}
		}
	}
	public static void Degistir(ArrayList<Sinif1> dizi) {
		ArrayList<Integer> Silinecek = new ArrayList<>();
		for(int i=0;i<10;i=i+2) {
			if(dizi.get(i).getY() == (dizi.get(i+1).getY()*2)) {
				Silinecek.add(i);
				Silinecek.add(i+1);
			}
			else if(dizi.get(i).getY() == dizi.get(i+1).getY()){
				if(dizi.get(i).getX() > dizi.get(i+1).getX()) {
					Silinecek.add(i);
					Silinecek.add(i+1);
				}
			}
		}
		for(int i=0;i<Silinecek.size();i++) {
			dizi.remove(Silinecek.get(i));
		}
	}
	public static void Yazdir(ArrayList<Sinif1> dizi) {
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+ ". X: " + dizi.get(i).getX() + " "+ (i+1) + ". Y: " + dizi.get(i).getY());
		}
	}
	public static void main(String[] args) {
		ArrayList<Sinif1> s = new ArrayList<Sinif1>(10);
		
		Doldur(s);
		Yazdir(s);
		Degistir(s);
		Yazdir(s);
		
	}
}