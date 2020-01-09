package project1;
import java.util.Random;
public class Zar {
	private int sayi;
	public Zar() {}
	public Zar(int sayi) {
		this.sayi=sayi;
	}
	public void setSayi(int sayi) {
		this.sayi=sayi;
	}
	public int getSayi() {
		return sayi;
	}
	public int zarAt() {
		Random random = new Random();
		int sayi = (random.nextInt(6)+1);
		this.sayi=sayi;
		return this.sayi;
	}
}
