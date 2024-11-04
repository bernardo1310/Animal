package Animal;
public class Reptil extends Animal {
	private String escama;
	private boolean ectotermia;
	public String getEscama() {
		return escama;
	}
	public void setEscama(String escama) {
		this.escama = escama;
	}
	public boolean isEctotermia() {
		return ectotermia;
	}
	public void setEctotermia(boolean ectotermia) {
		this.ectotermia = ectotermia;
	}
	@Override
	public String toString() {
		return "Reptil [escama=" + escama + ", ectotermia=" + ectotermia + "]";
	}
	
}
