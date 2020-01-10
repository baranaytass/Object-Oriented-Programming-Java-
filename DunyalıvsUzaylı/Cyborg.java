package UzayliVsDunyali;

public class Cyborg extends Uzayli{
	private int lazergucu;
	public int GucHesapla() {
		return lazergucu*super.savunma;
	}
	public int getLazergucu() {
		return lazergucu;
	}
	public void setLazergucu(int lazergucu) {
		this.lazergucu = lazergucu;
	}
	public Cyborg() {}
	public Cyborg(int savunma,int lazergucu) {
		this.lazergucu=lazergucu;
		this.savunma=savunma;
	}
}
