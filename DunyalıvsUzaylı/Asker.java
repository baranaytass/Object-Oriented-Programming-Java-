package UzayliVsDunyali;

public class Asker extends Dunyali{
	private int silahgucu;
	public int GucHesapla() {
		return silahgucu*super.savunma;
	}
	public int getSilahgucu() {
		return silahgucu;
	}
	public void setSilahgucu(int silahgucu) {
		this.silahgucu = silahgucu;
	}
	public Asker() {}
	public Asker(int savunma,int silahgucu) {
		this.silahgucu=silahgucu;
		this.savunma=savunma;
	}
}
