package Animal;
public class Animal {
	private boolean vivo;
	private String sexo;
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Animal [vivo=" + vivo + ", sexo=" + sexo + "]";
	}
}
