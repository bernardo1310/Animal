package Animal;
public class Lagarto extends Reptil{
	private boolean linguaBifurcada;
	private boolean mudaCor;
	public boolean isLinguaBifurcada() {
		return linguaBifurcada;
	}
	public void setLinguaBifurcada(boolean linguaBifurcada) {
		this.linguaBifurcada = linguaBifurcada;
	}
	public boolean isMudaCor() {
		return mudaCor;
	}
	public void setMudaCor(boolean mudaCor) {
		this.mudaCor = mudaCor;
	}
	@Override
	public String toString() {
		return "Lagarto [linguaBifurcada=" + linguaBifurcada + ", mudaCor=" + mudaCor + "]";
	}
}
