package Animal;
public class Cachorro extends Mamifero {
	private String tipoPelagem;
	private String tipoFocinho;
	public String getTipoPelagem() {
		return tipoPelagem;
	}
	public void setTipoPelagem(String tipoPelagem) {
		this.tipoPelagem = tipoPelagem;
	}
	public String getTipoFocinho() {
		return tipoFocinho;
	}
	public void setTipoFocinho(String tipoFocinho) {
		this.tipoFocinho = tipoFocinho;
	}
	@Override
	public String toString() {
		return "Cachorro [tipoPelagem=" + tipoPelagem + ", tipoFocinho=" + tipoFocinho + "]";
	}
	
}
