package Animal;
public class Tartaruga extends Reptil{
	private String tipoCasco;
	private boolean retrairCabeca;
	public String getTipoCasco() {
		return tipoCasco;
	}
	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	public boolean isRetrairCabeca() {
		return retrairCabeca;
	}
	public void setRetrairCabeca(boolean retrairCabeca) {
		this.retrairCabeca = retrairCabeca;
	}
	@Override
	public String toString() {
		return "Tartaruga [tipoCasco=" + tipoCasco + ", retrairCabeca=" + retrairCabeca + "]";
	}
}
