package UzayliVsDunyali;

public class Madenci extends Uzayli{
	private int madensayisi;
	public int GucHesapla() {
		return madensayisi;
	}
	public int getMadensayisi() {
		return madensayisi;
	}
	public void setMadensayisi(int madensayisi) {
		this.madensayisi = madensayisi;
	}
	public Madenci() {}
	public Madenci(int savunma,int madensayisi) {
		this.madensayisi=madensayisi;
		this.savunma=savunma;
	}
}
