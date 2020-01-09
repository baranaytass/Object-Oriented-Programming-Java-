package project1;
import java.util.ArrayList;
public class Main {
	public static int FrekansBul(ArrayList<Zar> dizi, int x) {
		int total=0;
		for(int i=0;i<dizi.size();i++) {
			if(dizi.get(i).getSayi()==x) {
				total++;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		ArrayList<Zar> arr = new ArrayList<>();
		int x=0;
		while(x==0) {
			Zar zar1 = new Zar();
			arr.add(zar1);
			Zar zar2 = new Zar();
			arr.add(zar2);
			zar1.zarAt();
			zar2.zarAt();
			if(zar1.getSayi()==zar2.getSayi()) {
				x=1;
			}
		}
		for(int i=0;i<arr.size();i=i+2) {
			System.out.println("Zarlar  :" + arr.get(i).getSayi() + "  " + arr.get(i+1).getSayi());
		}
		System.out.println("---FREKANSLARI---");
		for(int i=1;i<=6;i++) {
			System.out.println(i + "Toplamda " + FrekansBul(arr,i)+ "Kez Kullanýlmýþtýr... ");
		}
		
	}
}
