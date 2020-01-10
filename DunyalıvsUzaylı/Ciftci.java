package UzayliVsDunyali;

public class Ciftci extends Dunyali{
	private int urunsayisi;
	public int GucHesapla() {
		return urunsayisi;
	}
	public int getUrunsayisi() {
		return urunsayisi;
	}
	public void setUrunsayisi(int urunsayisi) {
		this.urunsayisi = urunsayisi;
	}
	public Ciftci() {}
	public Ciftci(int savunma,int urunsayisi) {
		this.urunsayisi=urunsayisi;
		this.savunma=savunma;
	}
}
